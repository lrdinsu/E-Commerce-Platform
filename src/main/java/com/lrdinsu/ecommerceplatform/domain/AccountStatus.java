package com.lrdinsu.ecommerceplatform.domain;

public enum AccountStatus {
    PENDING_VERIFICATION, // Account is created but not verified
    ACTIVE,               // Account is verified and active
    SUSPENDED,            // Account is suspended temporarily
    DEACTIVATED,          // Account is deactivated by the user
    BANNED,               // Account is banned by the admin
    CLOSED                // Account is closed permanently
}
