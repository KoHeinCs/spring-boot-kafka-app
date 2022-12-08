package com.ashwetaw.kafka.service;

import com.ashwetaw.kafka.dto.PaymentDTO;
import com.ashwetaw.kafka.entities.Payment;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

import com.ashwetaw.kafka.common.AppConstants;

@Service
@RequiredArgsConstructor
public class KafKaProducerService 
{
	private static final Logger logger = 
			LoggerFactory.getLogger(KafKaProducerService.class);

	private final KafkaTemplate<String, Object> kafkaTemplate;

	
	public void sendPayment(PaymentDTO paymentDTO)
	{
		logger.info(String.format("User created -> %s", paymentDTO));
		Message<PaymentDTO> message = MessageBuilder
				.withPayload(paymentDTO)
				.setHeader(KafkaHeaders.TOPIC,AppConstants.TOPIC_NAME_PAYMENT_LOG)
				.build();
		this.kafkaTemplate.send(message);
	}
}
