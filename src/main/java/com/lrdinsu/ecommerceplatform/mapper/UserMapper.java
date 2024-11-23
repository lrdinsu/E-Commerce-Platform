package com.lrdinsu.ecommerceplatform.mapper;

import com.lrdinsu.ecommerceplatform.dto.UserDTOs.UserDTO;
import com.lrdinsu.ecommerceplatform.dto.UserDTOs.UserRegistrationDTO;
import com.lrdinsu.ecommerceplatform.model.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface UserMapper {

    UserDTO toUserDTO(User user);

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "role", constant = "CUSTOMER")
    @Mapping(target = "cart", ignore = true)
    @Mapping(target = "orders", ignore = true)
    @Mapping(target = "createdAt", ignore = true)
    User toUser(UserRegistrationDTO userRegistrationDTO);

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "role", ignore = true)
    @Mapping(target = "password", ignore = true)
    @Mapping(target = "cart", ignore = true)
    @Mapping(target = "orders", ignore = true)
    @Mapping(target = "createdAt", ignore = true)
    void updateUserFromDTO(UserDTO userDTO, @MappingTarget User user);
}