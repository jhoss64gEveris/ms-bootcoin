package com.everis.msbootcoin.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection="rateBootcoin")
public class RateBootcoin {
	@Id
	private Integer idRateBootcoin;
	private String typeCoin;
	private Double rateChange;
}
