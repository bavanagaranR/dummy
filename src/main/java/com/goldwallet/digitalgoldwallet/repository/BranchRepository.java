package com.goldwallet.digitalgoldwallet.repository;

import com.goldwallet.digitalgoldwallet.entity.VendorBranch;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BranchRepository extends JpaRepository<VendorBranch, Integer> {
}
