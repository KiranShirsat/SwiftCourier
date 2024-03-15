package com.swiftCourier.service;

import java.util.List;

import com.swiftCourier.dto.TransactionDTO;

public interface TransactionService {
	
	public String addTransaction(TransactionDTO t);
	
	//Function to get transaction based on provided Source and destinations.
	public List<TransactionDTO> getTransaction(String source, String destination);

}
