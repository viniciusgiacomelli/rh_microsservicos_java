package com.microsservico.pagamento.services;

import org.springframework.stereotype.Service;

import com.microsservico.pagamento.entities.Payment;

@Service
public class PaymentService {
	
	public Payment getPayment(long workerId, int days) {
		/**Buscar worker do BD**/
		return new Payment("Bob", 200.0, days);
	}

}
