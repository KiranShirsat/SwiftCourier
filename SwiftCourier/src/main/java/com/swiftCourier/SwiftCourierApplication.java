package com.swiftCourier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.swiftCourier.dto.CustomerDTO;
import com.swiftCourier.service.RegistrationService;

@SpringBootApplication
public class SwiftCourierApplication implements CommandLineRunner{
	
	@Autowired
	private RegistrationService registrationService;
	
	public static void main(String[] args) {
		SpringApplication.run(SwiftCourierApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		CustomerDTO customer1 = new CustomerDTO("101", "ZabcG","Rahul", "Nashik", "rahul99@gmail.com");
		CustomerDTO customer2 = new CustomerDTO("102", "JaVcH","Nilesh", "Pune", "nkAmb@gmail.com");
		
		
		registrationService.insertUser(customer1);
		registrationService.insertUser(customer2);

	}

}
