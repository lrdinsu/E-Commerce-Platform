package com.lrdinsu.ecommerceplatform.model;

import jakarta.persistence.Column;

import java.time.LocalDate;

public class PaymentInformation {

    @Column(name = "cardHolder_name")
    private String cardHolderName;

    @Column(name = "card_number")
    private String cardNumber;

    @Column(name = "expiry_date")
    private LocalDate expiryDate;

    @Column(name = "cvv")
    private String cvv;
}
