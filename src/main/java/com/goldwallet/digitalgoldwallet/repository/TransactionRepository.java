package com.goldwallet.digitalgoldwallet.repository;

import com.goldwallet.digitalgoldwallet.entity.TransactionHistory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<TransactionHistory, Integer> {
}
