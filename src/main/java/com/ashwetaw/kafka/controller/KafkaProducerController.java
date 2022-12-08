package com.ashwetaw.kafka.controller;

import com.ashwetaw.kafka.dto.PaymentDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.ashwetaw.kafka.service.KafKaProducerService;

@RestController
@RequestMapping(value = "/api/v1/kafka")
public class KafkaProducerController {
	private final KafKaProducerService producerService;

	@Autowired
	public KafkaProducerController(KafKaProducerService producerService) {
		this.producerService = producerService;
	}

	
	@PostMapping(value = "/publish_payment")
	public ResponseEntity<String> sendMessageToKafkaTopic(@RequestBody PaymentDTO paymentDTO) {
		this.producerService.sendPayment(paymentDTO);
		return ResponseEntity.ok("Payment sent to kafka topic successfully");
	}
}