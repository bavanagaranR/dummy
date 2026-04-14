package com.goldwallet.digitalgoldwallet.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "virtual_gold_holdings")
public class VirtualGoldHolding {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer holdingId;

    private Double quantity;

    private LocalDateTime createdAt;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "branch_id")
    private VendorBranch branch;
}