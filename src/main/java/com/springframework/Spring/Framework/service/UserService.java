package com.springframework.Spring.Framework.service;

import com.springframework.Spring.Framework.dto.UserDTO;
import com.springframework.Spring.Framework.model.User;

import java.util.List;
import java.util.Map;

public interface UserService {

    Map<String, Object> saveUser(UserDTO userDTO);
    List<User> getAllUser();
    List<User> findByUsernameAndPassword(UserDTO userDTO);
}
