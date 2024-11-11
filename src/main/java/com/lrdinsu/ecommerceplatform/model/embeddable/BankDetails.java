package com.lrdinsu.ecommerceplatform.model.embeddable;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Embeddable
public class BankDetails {
    private String accountNumber;
    private String accountHolderName;
    private String bankName;
    private String routingNumber;
}
