package io.vijay.stackoverflow.controller;

import io.vijay.stackoverflow.request.UserDetailsRequestModel;
import io.vijay.stackoverflow.response.UserRest;
import io.vijay.stackoverflow.service.UserService;
import io.vijay.stackoverflow.shared.dto.UserDto;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("users") //Http://localhost:8080/users
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping
    public String getUser() {
        return "Get user was Called";
    }

    @PostMapping
    public UserRest createUser(@RequestBody UserDetailsRequestModel userDetails) {
        UserRest returnValue = new UserRest();

        UserDto userDto = new UserDto();
        BeanUtils.copyProperties(userDetails, userDto);

        UserDto createdUser = userService.createUser(userDto);
        BeanUtils.copyProperties(createdUser, returnValue);
        return returnValue;
    }

    @PutMapping
    public String updateUser() {
        return "Updated user was Called";
    }

    @DeleteMapping
    public String deleteUser() {
        return "Delete user was Called";
    }
}
