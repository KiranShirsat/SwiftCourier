package com.swiftCourier.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.swiftCourier.dto.CustomerDTO;
import com.swiftCourier.entity.Customer;
import com.swiftCourier.repository.CustomerRepository;

@Service
public class RegistrationServiceImpl implements RegistrationService{

	@Autowired
	private CustomerRepository customerRepo;
	
	
	@Override
	public String insertUser(CustomerDTO customerDTO) {

		customerRepo.save(CustomerDTO.prepareCustomerEntity(customerDTO));
		
		return "New customer registered sucessfully!";
	}

}
