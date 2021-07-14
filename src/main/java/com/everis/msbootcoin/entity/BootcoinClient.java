package com.everis.msbootcoin.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection = "bootcoinClient")
public class BootcoinClient {
	@Id
	private String idClient;
	private String clientDocument;
	private String clientDescription;
	private TypeClient typeClient;
	private String clientCelphone;
	private String clientEmail;	
	
}
