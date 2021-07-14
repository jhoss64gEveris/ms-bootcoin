package com.everis.msbootcoin.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.everis.msbootcoin.entity.RateBootcoin;
import com.everis.msbootcoin.repository.RateBootcoinRepository;

import lombok.extern.slf4j.Slf4j;
import reactor.core.publisher.Mono;

@Slf4j
@Service
public class RateBootcoinService {
	
	@Autowired
	private RateBootcoinRepository repository;

	private static String ACTIVE_CURRENT = "A";
	
	public Mono<RateBootcoin> setRateCoin(RateBootcoin rate){
		Mono<RateBootcoin> rateResult;
		rateResult = repository.save(rate)
				.doOnNext(p -> log.info("Insert new rate coin in "+p.getTypeCoin() +" with "+
						p.getRateChange()));
		return rateResult;
	}
	
	public Mono<RateBootcoin> findActiveRateCoin(String typeMoneyCoin){
		Mono<RateBootcoin> rateResult;
		rateResult = repository.findByTypeCoinAndIsCurren(typeMoneyCoin, ACTIVE_CURRENT)
				.doOnNext(p -> log.info("Found "+p.getTypeCoin()));
		return rateResult;
	}
}
