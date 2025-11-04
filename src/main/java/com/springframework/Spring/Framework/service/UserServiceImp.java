package com.springframework.Spring.Framework.service;

import com.springframework.Spring.Framework.dto.UserDTO;
import com.springframework.Spring.Framework.model.User;
import com.springframework.Spring.Framework.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class UserServiceImp implements UserService{

    private final UserRepository userRepository;

    public UserServiceImp(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public Map<String, Object> saveUser(UserDTO userDTO) {

        String message = "";
        List<User> userList = userRepository.findAll()
                .stream()
                .filter(user -> user.getUsername().equals(userDTO.getUsername())
                        || user.getEmail().equals(userDTO.getEmail()))
                .toList();

        if(userList.isEmpty()){
            message = "User saved successfully";
            User user = new User(
                    userDTO.getUsername(),
                    userDTO.getPassword(),
                    userDTO.getEmail(),
                    userDTO.getRole(),
                    userDTO.getStatus()
            );
            userRepository.save(user);
            return Map.of("message", message,
                    "Details", user);
        }else{
            message = "Username or Email already exists";
            return Map.of("message", message,
                    "Details", userList.get(0));
        }


    }

    @Override
    public List<User> getAllUser() {
        return userRepository.findAll().stream().toList();
    }
}
