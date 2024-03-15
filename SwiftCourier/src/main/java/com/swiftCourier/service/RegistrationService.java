package com.swiftCourier.service;

import java.util.List;

import com.swiftCourier.dto.CustomerDTO;

public interface RegistrationService {
	
	public String insertUser(CustomerDTO customerDTO);
	
	public List<CustomerDTO> getAllCustomers();
	
}
