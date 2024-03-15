package com.swiftCourier.dto;

import com.swiftCourier.entity.Transaction;

public class TransactionDTO {

	private Integer id;
	private String sender;
	private String senderAddress;
	private String senderCity;
	private String receiver;
	private String receiverAddress;
	private String receiverCity;
	private String status;

	public TransactionDTO() {
		super();
	}

	public TransactionDTO(Integer id, String sender, String senderAddress, String senderCity, String receiver,
			String receiverAddress, String receiverCity, String status) {

		this.id = id;
		this.sender = sender;
		this.senderAddress = senderAddress;
		this.senderCity = senderCity;
		this.receiver = receiver;
		this.receiverAddress = receiverAddress;
		this.receiverCity = receiverCity;
		this.status = status;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getSender() {
		return sender;
	}

	public void setSender(String sender) {
		this.sender = sender;
	}

	public String getSenderAddress() {
		return senderAddress;
	}

	public void setSenderAddress(String senderAddress) {
		this.senderAddress = senderAddress;
	}

	public String getSenderCity() {
		return senderCity;
	}

	public void setSenderCity(String senderCity) {
		this.senderCity = senderCity;
	}

	public String getReceiver() {
		return receiver;
	}

	public void setReceiver(String receiver) {
		this.receiver = receiver;
	}

	public String getReceiverAddress() {
		return receiverAddress;
	}

	public void setReceiverAddress(String receiverAddress) {
		this.receiverAddress = receiverAddress;
	}

	public String getReceiverCity() {
		return receiverCity;
	}

	public void setReceiverCity(String receiverCity) {
		this.receiverCity = receiverCity;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "TransactionDTO [id=" + id + ", sender=" + sender + ", senderAddress=" + senderAddress + ", senderCity="
				+ senderCity + ", receiver=" + receiver + ", receiverAddress=" + receiverAddress + ", receiverCity="
				+ receiverCity + ", status=" + status + "]";
	}

	public static Transaction prepareTransactionEntity(TransactionDTO transactionDTO) {
		// creating entity class obj and populating values coming from DTO class to
		// store them on database
		Transaction transactionEntity = new Transaction();

		transactionEntity.setId(transactionDTO.getId());
		transactionEntity.setReceiver(transactionDTO.getReceiver());
		transactionEntity.setReceiverAddress(transactionDTO.getReceiverAddress());
		transactionEntity.setReceiverCity(transactionDTO.getReceiverCity());
		transactionEntity.setSender(transactionDTO.getSender());
		transactionEntity.setSenderAddress(transactionDTO.getSenderAddress());
		transactionEntity.setSenderCity(transactionDTO.getSenderCity());
		transactionEntity.setStatus(transactionDTO.getStatus());

		return transactionEntity;

	}

}
