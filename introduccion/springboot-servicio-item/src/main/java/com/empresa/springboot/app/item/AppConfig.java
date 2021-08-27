package com.empresa.springboot.app.item;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration //Permite crear objetos (beans)
public class AppConfig {
		
	@Bean("clienteRest") //Registra el cliente Bean - para poder acceder a recursos de otros microservicios
	public RestTemplate registrarRestTemplate() {
		return new RestTemplate();
	}
	
}
