package com.lrdinsu.ecommerceplatform.dto.PaymentDTOs;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PaymentResponseDTO {
    private String sessionId;
    private String paymentUrl;
}
