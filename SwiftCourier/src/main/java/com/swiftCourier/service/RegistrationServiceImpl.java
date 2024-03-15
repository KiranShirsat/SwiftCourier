package com.swiftCourier.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.swiftCourier.dto.CustomerDTO;
import com.swiftCourier.entity.Customer;
import com.swiftCourier.repository.CustomerRepository;

@Service
public class RegistrationServiceImpl implements RegistrationService {

	@Autowired
	private CustomerRepository customerRepository;

	@Override
	public String insertUser(CustomerDTO customerDTO) {

		customerRepository.save(CustomerDTO.prepareCustomerEntity(customerDTO));

		return "New customer registered sucessfully!";
	}

	@Override
	public List<CustomerDTO> getAllCustomers() {

		List<CustomerDTO> ListDTO = new ArrayList<>();

		List<Customer> entityList = customerRepository.findAll();

		for (Customer customer : entityList) {

			CustomerDTO prepareCustomerDTO = Customer.prepareCustomerDTO(customer);
			ListDTO.add(prepareCustomerDTO);
		}

		return ListDTO;
	}

}
