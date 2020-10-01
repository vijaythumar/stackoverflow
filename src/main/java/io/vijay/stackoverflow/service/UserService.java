package io.vijay.stackoverflow.service;

import io.vijay.stackoverflow.shared.dto.UserDto;

public interface UserService {
    default UserDto createUser(UserDto user) {
        return null;
    }
}
