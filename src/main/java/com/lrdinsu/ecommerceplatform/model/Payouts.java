package com.lrdinsu.ecommerceplatform.model;

import com.lrdinsu.ecommerceplatform.domain.PayoutsStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Payouts {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToMany
    private List<Transaction> transactions = new ArrayList<>();

    @ManyToOne
    private Seller seller;

    private Long amount;

    private PayoutsStatus status = PayoutsStatus.PENDING;

    private LocalDateTime date = LocalDateTime.now();
}
