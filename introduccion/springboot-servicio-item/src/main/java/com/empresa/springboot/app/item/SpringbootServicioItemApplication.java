package com.empresa.springboot.app.item;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@RibbonClient(name = "servicio-productos") //Colocamos el nommbre del servicio que se encuentra en el properties; si tuvieramos mas clientes configuramos @RibbonClients
@EnableFeignClients //habilita clientes feing que tenemos implementados en el proyecto
@SpringBootApplication
public class SpringbootServicioItemApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootServicioItemApplication.class, args);
	}

}
