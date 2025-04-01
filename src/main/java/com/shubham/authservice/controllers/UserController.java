package com.shubham.authservice.controllers;

import com.shubham.authservice.services.UserService;
import com.shubham.openapi.api.UserApi;
import com.shubham.openapi.model.*;
import java.util.List;
import javax.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class UserController implements UserApi {

  private final UserService userService;

  @Override
  public ResponseEntity<List<UserDto>> getAllUsers() {
    List<UserDto> list =
        userService.getAllUsers().stream().map(userService::convertEntityToModel).toList();
    return ResponseEntity.ok(list);
  }

  @Override
  public ResponseEntity<UserDto> getUserById(String id) {
    return ResponseEntity.ok(userService.getUserById(id));
  }

  @Override
  public ResponseEntity<UserDto> createUser(@Valid UserDto dto) {
    UserDto savedUser = userService.createUser(dto);
    return ResponseEntity.status(HttpStatus.CREATED).body(savedUser);
  }

  @Override
  public ResponseEntity<UserDto> updateUser(String id, @Valid UserDto dto) {
    return ResponseEntity.ok().body(userService.updateUser(id, dto));
  }

  @Override
  public ResponseEntity<SuccessDto> deleteUser(String id) {
    userService.deleteUser(id);
    return ResponseEntity.status(HttpStatus.NO_CONTENT).body(null);
  }
}
