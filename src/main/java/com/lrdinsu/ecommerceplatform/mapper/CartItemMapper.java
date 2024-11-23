package com.lrdinsu.ecommerceplatform.mapper;

import com.lrdinsu.ecommerceplatform.dto.CartDTOs.AddToCartDTO;
import com.lrdinsu.ecommerceplatform.dto.CartDTOs.CartItemDTO;
import com.lrdinsu.ecommerceplatform.dto.CartDTOs.UpdateCartItemDTO;
import com.lrdinsu.ecommerceplatform.model.CartItem;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring", uses = {ProductMapper.class})
public interface CartItemMapper {

    @Mapping(source = "product.id", target = "productId")
    @Mapping(source = "product.name", target = "productName")
    @Mapping(source = "product.image", target = "image")
    @Mapping(source = "product.price", target = "price")
    CartItemDTO toCartItemDTO(CartItem cartItem);

    @Mapping(target = "cart", ignore = true)
    @Mapping(target = "id.cartId", ignore = true)
    @Mapping(target = "product", ignore = true)
    CartItem toCartItem(AddToCartDTO addToCartDTO);

    @Mapping(target = "cart", ignore = true)
    @Mapping(target = "id.cartId", ignore = true)
    @Mapping(target = "product", ignore = true)
    void updateCartItemFromDTO(UpdateCartItemDTO updateCartItemDTO, @MappingTarget CartItem cartItem);
}
