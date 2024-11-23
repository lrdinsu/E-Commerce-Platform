package com.lrdinsu.ecommerceplatform.mapper;

import com.lrdinsu.ecommerceplatform.dto.OrderDTOs.OrderDTO;
import com.lrdinsu.ecommerceplatform.model.Order;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring", uses = {OrderItemMapper.class})
public interface OrderMapper {

    @Mapping(source = "orderItems", target = "orderItems")
    OrderDTO toOrderDTO(Order order);

    @InheritInverseConfiguration
    Order toOrder(OrderDTO orderDTO);
}