package com.shubham.authservice.services;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.shubham.authservice.model.User;
import com.shubham.authservice.repos.UserRepository;
import com.shubham.openapi.model.UserDto;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

  private final UserRepository userRepository;
  private final ObjectMapper objectMapper;

  public List<User> getAllUsers() {
    return userRepository.findAll();
  }

  public UserDto getUserById(String id) {
    User user =
        userRepository
            .findById(id)
            .orElseThrow(() -> new RuntimeException("User not found with id " + id));
    return convertEntityToModel(user);
  }

  public UserDto createUser(UserDto dto) {
    User savedUser = userRepository.save(buildAndSave(dto));
    return convertEntityToModel(savedUser);
  }

  public UserDto updateUser(String id, UserDto userDto) {
    User updatedUser =
        userRepository
            .findById(id)
            .map(user -> buildUser(user, userDto))
            .map(userRepository::save)
            .orElseThrow(() -> new RuntimeException("User not found with id " + id));
    return convertEntityToModel(updatedUser);
  }

  public UserDto convertEntityToModel(User user) {
    return objectMapper.convertValue(user, UserDto.class);
  }

  public void deleteUser(String id) {
    userRepository
        .findById(id)
        .ifPresentOrElse(
            user -> userRepository.deleteById(user.getId()),
            () -> new RuntimeException("User not found with id :" + id));
  }

  public User buildAndSave(UserDto dto) {
    return User.builder()
        .username(dto.getUsername())
        .firstname(dto.getFirstname())
        .lastname(dto.getLastname())
        .email(dto.getEmail())
        .mobileNumber(dto.getMobileNumber())
        .streetAddress(dto.getStreetAddress())
        .build();
  }

  public User buildUser(User existingUser, UserDto dto) {
    existingUser.setUsername(dto.getUsername());
    existingUser.setFirstname(dto.getFirstname());
    existingUser.setLastname(dto.getLastname());
    existingUser.setEmail(dto.getEmail());
    existingUser.setMobileNumber(dto.getMobileNumber());
    existingUser.setStreetAddress(dto.getStreetAddress());
    return existingUser;
  }
}
