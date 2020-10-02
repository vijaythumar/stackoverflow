package io.vijay.stackoverflow.service;

import io.vijay.stackoverflow.shared.dto.UserDto;

// This page is for create user and update,delete,modify etc.. actions this is executing quarries

public interface UserService {
    default UserDto createUser(UserDto user) {
        return null;
    }
}
