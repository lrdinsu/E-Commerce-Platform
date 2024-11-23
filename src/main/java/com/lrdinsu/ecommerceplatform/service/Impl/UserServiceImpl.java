package com.lrdinsu.ecommerceplatform.service.Impl;

import com.lrdinsu.ecommerceplatform.dto.UserDTOs.UserDTO;
import com.lrdinsu.ecommerceplatform.dto.UserDTOs.UserRegistrationDTO;
import com.lrdinsu.ecommerceplatform.mapper.UserMapper;
import com.lrdinsu.ecommerceplatform.model.User;
import com.lrdinsu.ecommerceplatform.repository.UserRepository;
import com.lrdinsu.ecommerceplatform.service.UserService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final UserMapper userMapper;
    private final PasswordEncoder passwordEncoder;

    public UserServiceImpl(UserRepository userRepository,
                           UserMapper userMapper,
                           PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.userMapper = userMapper;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public UserDTO registerUser(UserRegistrationDTO userRegistrationDTO) {
        Optional<User> existingUser = userRepository.findByEmail(userRegistrationDTO.getEmail());
        if (existingUser.isPresent()) {
            throw new RuntimeException("Email is already in use");
        }

        User user = userMapper.toUser(userRegistrationDTO);
        user.setPassword(passwordEncoder.encode(userRegistrationDTO.getPassword()));
        User savedUser = userRepository.save(user);
        return userMapper.toUserDTO(savedUser);
    }
}
