package com.everis.msbootcoin.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.everis.msbootcoin.entity.RateBootcoin;

import reactor.core.publisher.Mono;

public interface RateBootcoinRepository extends ReactiveMongoRepository<RateBootcoin, String> {
	
	//method by locally typeChange current day.
	public Mono<RateBootcoin> findByTypeCoinAndIsCurren(String isCurren, String typeCoin);

}
