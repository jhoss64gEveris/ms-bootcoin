package com.everis.msbootcoin.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection="TypeClient")
public class TypeClient {
	@Id
	private Integer idTypeClient;
	private String typeClientDescription;
}
