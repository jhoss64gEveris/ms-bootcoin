package com.everis.msbootcoin.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.everis.msbootcoin.entity.BootcoinClient;

import reactor.core.publisher.Mono;

public interface BootcoinClientRepository extends ReactiveMongoRepository<BootcoinClient, String> {
	
	public Mono<BootcoinClient> findByClientDescription(String clientDescription);

}
