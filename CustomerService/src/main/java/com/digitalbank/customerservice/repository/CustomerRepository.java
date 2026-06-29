package com.digitalbank.customerservice.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.digitalbank.customerservice.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long>{
	Optional<Customer> findByEmail(String email);
	Optional<Customer> findByExternalId(String externalId);
	boolean existByEmail(String Email);
}
