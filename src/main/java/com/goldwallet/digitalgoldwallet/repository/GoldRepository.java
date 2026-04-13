package com.goldwallet.digitalgoldwallet.repository;

import com.goldwallet.digitalgoldwallet.entity.VirtualGoldHolding;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GoldRepository extends JpaRepository<VirtualGoldHolding, Integer> {
}
