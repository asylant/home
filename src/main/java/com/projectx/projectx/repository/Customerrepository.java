package com.projectx.projectx.repository;

import com.projectx.projectx.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Customerrepository extends JpaRepository<Customer, Long> {
}
