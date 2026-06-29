package com.digitalbank.customerservice.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import jakarta.persistence.Version;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

@Entity
@Table(name="customers", 
uniqueConstraints = {
		@UniqueConstraint(name="uniq_customers_email",columnNames = "email"),
		@UniqueConstraint(name="uniq_customers_external_id", columnNames = "external_id")
})

public class Customer {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Version
	@Column(name="version", nullable = false)
	private Integer version;
	@Column(name = "first_name", nullable = false)
	private String firstName;
	@Column(name = "last_name", nullable = false)
	private String lastName;
	@Column(name = "email",nullable = false)
	private String email;
	@Column(name="phone", nullable = false)
	private String phone;
	@Column(name = "address",nullable = false)
	private String address;
	@Column(name = "external_id", nullable = false, unique = true)
	private String externalId; //treat as idempotency key for create
	
	
	
}
