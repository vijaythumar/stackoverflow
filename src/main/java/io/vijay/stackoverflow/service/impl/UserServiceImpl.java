package io.vijay.stackoverflow.service.impl;

import io.vijay.stackoverflow.UserRepository;
import io.vijay.stackoverflow.entities.User;
import io.vijay.stackoverflow.service.UserService;
import io.vijay.stackoverflow.shared.dto.UserDto;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    UserRepository userRepository;

    @Override
    public UserDto createUser(UserDto user) {

        User user1 = new User();
        BeanUtils.copyProperties(user, user1);

        User.setEncryptedPassword("test");
        User.setUserId("testUserID");

        User storeUserDetails = userRepository.save(user1);

        UserDto returnValue = new UserDto();
        BeanUtils.copyProperties(storeUserDetails, returnValue);

        return returnValue;
    }
}

//@Service
//interface UserServiceImpl extends UserService {
//    public default UserDto createUser(UserDto user){
//        UserDto userDto = null;
//        return userDto;
//    };
//}
