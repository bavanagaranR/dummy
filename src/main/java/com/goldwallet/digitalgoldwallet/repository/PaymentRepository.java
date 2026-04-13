package com.goldwallet.digitalgoldwallet.repository;

import com.goldwallet.digitalgoldwallet.entity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payment, Integer> {
}
