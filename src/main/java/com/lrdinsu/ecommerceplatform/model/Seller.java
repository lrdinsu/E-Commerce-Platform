package com.lrdinsu.ecommerceplatform.model;

import com.lrdinsu.ecommerceplatform.domain.AccountStatus;
import com.lrdinsu.ecommerceplatform.domain.USER_ROLE;
import com.lrdinsu.ecommerceplatform.model.embeddable.BankDetails;
import com.lrdinsu.ecommerceplatform.model.embeddable.BusinessDetails;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Seller {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String sellerName;

    private String mobile;

    @Column(unique = true, nullable = false)
    private String email;

    private String password;

    @Embedded
    private BusinessDetails businessDetails = new BusinessDetails();

    @Embedded
    private BankDetails bankDetails = new BankDetails();

    @OneToOne(cascade = CascadeType.ALL)
    private Address pickupAddress = new Address();

    private USER_ROLE role = USER_ROLE.SELLER;

    private boolean isEmailVerified = false;

    private AccountStatus accountStatus = AccountStatus.PENDING_VERIFICATION;

}
