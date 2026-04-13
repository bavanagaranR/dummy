package com.goldwallet.digitalgoldwallet.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "payments")
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer paymentId;

    private Double amount;

    private String paymentMethod;
    // Example: "Credit Card", "Google Pay"

    private String transactionType;
    // Example: "Credited to wallet", "Debited from wallet"

    private String paymentStatus;
    // Example: "Success", "Failed"

    private LocalDateTime createdAt;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
}