package com.swiftCourier.dto;

import com.swiftCourier.entity.Customer;

public class CustomerDTO {

	private String userId;
	private String password;
	private String name;
	private String city;
	private String email;
	
	public CustomerDTO() {
		super();
	}
	public CustomerDTO(String userId, String password, String name, String city, String email) {
		
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
		return "CustomerDTO [userId=" + userId + ", password=" + password + ", name=" + name + ", city=" + city
				+ ", email=" + email + "]";
	}
	
	
	public static Customer prepareCustomerEntity(CustomerDTO customerDTO) {
		
		Customer customerEntity = new Customer();
		
		customerEntity.setUserId(customerDTO.getUserId());
		customerEntity.setName(customerDTO.getName());
		customerEntity.setEmail(customerDTO.getEmail());
		customerEntity.setPassword(customerDTO.getPassword());
		customerEntity.setCity(customerDTO.getCity());
		
		return customerEntity;
	}
	
}
