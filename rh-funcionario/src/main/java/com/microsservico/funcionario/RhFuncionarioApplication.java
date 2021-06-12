package com.microsservico.funcionario;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class RhFuncionarioApplication {

	public static void main(String[] args) {
		SpringApplication.run(RhFuncionarioApplication.class, args);
	}

}
