package com.swiftCourier.entity;

import com.swiftCourier.dto.CustomerDTO;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Customer {

	@Id
	private String userId;
	private String password;
	private String name;
	private String city;
	private String email;

	public Customer() {
		super();

	}

	public Customer(String userId, String password, String name, String city, String email) {
		super();
		this.userId = userId;
		this.password = password;
		this.name = name;
		this.city = city;
		this.email = email;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Customer [userId=" + userId + ", password=" + password + ", name=" + name + ", city=" + city
				+ ", email=" + email + "]";
	}

	public static CustomerDTO prepareCustomerDTO(Customer customer) {
		// creating one DTO object and populating values inside this obj which we got
		// from entity class
		CustomerDTO custDTO = new CustomerDTO();
		custDTO.setName(customer.getName());
		custDTO.setEmail(customer.getEmail());
		custDTO.setCity(customer.getCity());
		custDTO.setUserId(customer.getUserId());
		custDTO.setPassword(customer.getPassword());

		return custDTO;

	}

}
