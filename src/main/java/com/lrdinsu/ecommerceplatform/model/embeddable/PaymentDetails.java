package com.lrdinsu.ecommerceplatform.model.embeddable;

import com.lrdinsu.ecommerceplatform.domain.PaymentStatus;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Embeddable
public class PaymentDetails {

    private String cardNumber;
    private String cardHolderName;
    private String expiryDate;
    private String cvv;
    private PaymentStatus status;

}
