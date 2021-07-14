package com.everis.msbootcoin.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection="type_transaction")
public class TypeTransaction {
	@Id
	private Integer idTypeTransaction;
	private String typuTransactionDescrip;

}
