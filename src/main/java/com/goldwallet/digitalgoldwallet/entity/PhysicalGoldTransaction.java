package com.goldwallet.digitalgoldwallet.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "physical_gold_transactions")
public class PhysicalGoldTransaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer transactionId;

    private Double quantity;

    private LocalDateTime createdAt;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "branch_id")
    private VendorBranch branch;

    @ManyToOne
    @JoinColumn(name = "delivery_address_id")
    private Address deliveryAddress;
}