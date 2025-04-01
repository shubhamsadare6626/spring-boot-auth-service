package com.shubham.authservice.handler;

import com.shubham.openapi.model.ErrorResponse;
import com.shubham.openapi.model.GlobalExceptionDto;
import com.shubham.openapi.model.ValidationError;
import jakarta.servlet.http.HttpServletRequest;
import java.time.LocalDateTime;
import java.util.List;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@Slf4j
@RestControllerAdvice
@RequiredArgsConstructor
public class ControllerAdvisor {

  @ExceptionHandler(MethodArgumentNotValidException.class)
  public ResponseEntity<ErrorResponse> handleValidationExceptions(
      MethodArgumentNotValidException ex) {
    log.info("Exception Handled : {}", ex.getObjectName());
    List<ValidationError> errors =
        ex.getBindingResult().getFieldErrors().stream()
            .map(error -> new ValidationError(error.getField(), error.getDefaultMessage()))
            .toList();

    ErrorResponse errorResponse =
        new ErrorResponse(400, "Validation failed for request data", errors);
    return new ResponseEntity<>(errorResponse, HttpStatus.BAD_REQUEST);
  }

  @ExceptionHandler(RuntimeException.class)
  public ResponseEntity<GlobalExceptionDto> handleRuntimeException(
      RuntimeException ex, HttpServletRequest request) {
    log.error("Internal Server Error: {}", ex.getMessage(), ex);

    GlobalExceptionDto errorResponse =
        new GlobalExceptionDto(
            LocalDateTime.now().toString(),
            HttpStatus.INTERNAL_SERVER_ERROR.value(),
            "Internal Server Error",
            request.getRequestURI(), // Get the endpoint path
            "Unhandled Exception occurred while performing operation");

    return new ResponseEntity<>(errorResponse, HttpStatus.INTERNAL_SERVER_ERROR);
  }
}
