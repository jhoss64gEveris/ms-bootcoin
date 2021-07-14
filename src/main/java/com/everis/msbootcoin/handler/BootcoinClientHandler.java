package com.everis.msbootcoin.handler;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;

import com.everis.msbootcoin.entity.BootcoinClient;
import com.everis.msbootcoin.service.BootcoinClientService;

import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Mono;

@RequiredArgsConstructor
@Component
public class BootcoinClientHandler {
	private final BootcoinClientService service;
	
	public Mono<ServerResponse> createNewClient (ServerRequest request){
		final Mono<BootcoinClient> client = request.bodyToMono(BootcoinClient.class);
		return ServerResponse.ok()
				.contentType(MediaType.APPLICATION_JSON)
				.body(BodyInserters.fromPublisher(client.flatMap(service::createNewBootcoinClient), BootcoinClient.class));
	}
}
