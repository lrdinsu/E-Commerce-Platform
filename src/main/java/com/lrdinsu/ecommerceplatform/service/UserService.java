package com.lrdinsu.ecommerceplatform.service;

import com.lrdinsu.ecommerceplatform.model.User;
import jakarta.validation.Valid;

public interface UserService {
    User registerUser(@Valid User user);
}
