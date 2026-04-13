package com.goldwallet.digitalgoldwallet.repository;

import com.goldwallet.digitalgoldwallet.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
