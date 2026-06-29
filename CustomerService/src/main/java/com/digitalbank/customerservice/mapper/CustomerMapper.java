package com.digitalbank.customerservice.mapper;

import com.digitalbank.customerservice.dto.CustomerCreateResponse;
import com.digitalbank.customerservice.dto.CustomerRequest;
import com.digitalbank.customerservice.model.Customer;



public interface CustomerMapper {
	
	Customer toEntity(CustomerRequest request);
	CustomerCreateResponse toResponse(Customer customer);
}
