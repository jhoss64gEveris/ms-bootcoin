package com.everis.msbootcoin.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection="transaction")
public class Transaction {
	@Id
	private String transactionNumber;
	private String amount;
	private String modePay;
	private String numberAccount;
	private String numberCelphone;
	private String idClient;
	private String dateTransaction;
	private String isTransactionAccept;
}
