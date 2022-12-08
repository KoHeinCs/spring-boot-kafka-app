package com.ashwetaw.kafka.service;

import com.ashwetaw.kafka.dto.PaymentDTO;
import com.ashwetaw.kafka.mapper.PaymentMapper;
import com.ashwetaw.kafka.repositories.PaymentRepository;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.ashwetaw.kafka.common.AppConstants;

@Service
@RequiredArgsConstructor
public class KafKaConsumerService 
{
	private final Logger logger = LoggerFactory.getLogger(KafKaConsumerService.class);
	private final PaymentRepository paymentRepository;
	private final PaymentMapper paymentMapper;

	@KafkaListener(topics = AppConstants.TOPIC_NAME_PAYMENT_LOG, groupId = AppConstants.GROUP_ID)
	public void consume(PaymentDTO paymentDTO) {
		logger.info(String.format("Payment created -> %s", paymentDTO));
		paymentRepository.save(paymentMapper.toEntity(paymentDTO));
	}
}
