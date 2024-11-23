package com.lrdinsu.ecommerceplatform.service;

import com.lrdinsu.ecommerceplatform.dto.UserDTOs.UserDTO;
import com.lrdinsu.ecommerceplatform.dto.UserDTOs.UserRegistrationDTO;
import jakarta.validation.Valid;

public interface UserService {
    UserDTO registerUser(@Valid UserRegistrationDTO userRegistrationDTO);
}
