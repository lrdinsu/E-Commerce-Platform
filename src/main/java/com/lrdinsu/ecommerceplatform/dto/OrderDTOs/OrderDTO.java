package com.lrdinsu.ecommerceplatform.dto.OrderDTOs;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class OrderDTO {

    private Long id;
    private Long totalAmount;
    private LocalDateTime createdAt;
    private List<OrderItemDTO> orderItems;
}
