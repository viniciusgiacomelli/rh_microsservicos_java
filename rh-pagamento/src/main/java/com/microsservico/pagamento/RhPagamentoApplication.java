package com.microsservico.pagamento;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class RhPagamentoApplication {

	public static void main(String[] args) {
		SpringApplication.run(RhPagamentoApplication.class, args);
	}

}
