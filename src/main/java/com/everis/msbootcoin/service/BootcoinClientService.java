package com.everis.msbootcoin.service;

import org.springframework.stereotype.Service;

import com.everis.msbootcoin.entity.BootcoinClient;
import com.everis.msbootcoin.repository.BootcoinClientRepository;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import reactor.core.publisher.Mono;

@Slf4j
@RequiredArgsConstructor
@Service
public class BootcoinClientService {
	
	private static BootcoinClientRepository repository;
	
	public Mono<BootcoinClient> createNewBootcoinClient(BootcoinClient bootcoinClient){		
		return repository.save(bootcoinClient);		
	}
	
	public Mono<BootcoinClient> findBootcoinClient(String description){
		return repository.findByClientDescription(description)
				.doOnNext(a -> log.info("Client bootcoin "+a.getClientDescription()+" found"));
	}

}
