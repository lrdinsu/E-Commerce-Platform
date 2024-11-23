package com.lrdinsu.ecommerceplatform.mapper;

import com.lrdinsu.ecommerceplatform.dto.CartDTOs.CartDTO;
import com.lrdinsu.ecommerceplatform.model.Cart;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring", uses = {CartItemMapper.class})
public interface CartMapper {

    @Mapping(source = "cartItems", target = "items")
    CartDTO toCartDTO(Cart cart);
}