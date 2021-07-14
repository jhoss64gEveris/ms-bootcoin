package com.everis.msbootcoin.router;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

import com.everis.msbootcoin.handler.BootcoinClientHandler;


@Configuration
public class BootcoinClientRoutes {
	  @Bean
	    public RouterFunction<ServerResponse> routes(BootcoinClientHandler handler){
	        return RouterFunctions.route().path(
	        "/bootcoin/bootcoin", builder -> builder
	            .POST("/create", handler::createNewClient)
	        	).build();
	    }
}
