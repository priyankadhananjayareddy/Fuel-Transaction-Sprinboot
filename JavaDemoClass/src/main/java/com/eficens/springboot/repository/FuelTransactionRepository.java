package com.eficens.springboot.repository;
import com.eficens.springboot.entity.FuelTransaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FuelTransactionRepository extends JpaRepository<FuelTransaction, Long> {
}