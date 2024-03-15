package com.swiftCourier.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.swiftCourier.dto.TransactionDTO;
import com.swiftCourier.entity.Transaction;
import com.swiftCourier.repository.TransactionRepository;

@Service
public class TransactionServiceImpl implements TransactionService{

	@Autowired
	private TransactionRepository transRepository;
	
	@Override
	public String addTransaction(TransactionDTO transDTO) {
		
		Transaction transactionEntity = TransactionDTO.prepareTransactionEntity(transDTO);
		transRepository.save(transactionEntity);
		
		return "New Transaction added successfully";
	}

	@Override
	public List<TransactionDTO> getTransaction(String source, String destination) {

		List<TransactionDTO> listDTO = new ArrayList<>();
		
		List<Transaction> entityList= transRepository.findAll();
		
		for(Transaction transaction:entityList) {
			
			TransactionDTO transactionDTO = Transaction.prepareTransactionDTO(transaction);
			listDTO.add(transactionDTO);
		}
		
		return listDTO;
	}
	
	
	
	
	

}
