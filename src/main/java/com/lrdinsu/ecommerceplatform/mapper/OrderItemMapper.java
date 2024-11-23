package com.lrdinsu.ecommerceplatform.mapper;

import com.lrdinsu.ecommerceplatform.dto.OrderDTOs.OrderItemDTO;
import com.lrdinsu.ecommerceplatform.model.OrderItem;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface OrderItemMapper {

    @Mapping(source = "product.id", target = "productId")
    @Mapping(source = "product.name", target = "productName")
    OrderItemDTO toOrderItemDTO(OrderItem orderItem);

    @InheritInverseConfiguration
    @Mapping(target = "order", ignore = true)
    @Mapping(target = "id.orderId", ignore = true)
    @Mapping(target = "product", ignore = true)
    OrderItem toOrderItem(OrderItemDTO orderItemDTO);
}