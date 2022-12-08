package com.ashwetaw.kafka;

import com.ashwetaw.kafka.dto.PaymentDTO;
import com.ashwetaw.kafka.service.KafKaProducerService;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.w3c.dom.stylesheets.LinkStyle;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

@SpringBootApplication
@RequiredArgsConstructor
public class SpringBootKafkaAppApplication implements CommandLineRunner {

	private final KafKaProducerService producerService;
	private final Logger logger = LoggerFactory.getLogger(SpringBootKafkaAppApplication.class);
	private final CountDownLatch latch = new CountDownLatch(3);

	public static void main(String[] args) {
		SpringApplication.run(SpringBootKafkaAppApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
//		List<PaymentDTO> paymentDTOList = new ArrayList<>();
//		PaymentDTO paymentDTO1 = new PaymentDTO("1000000001", LocalDateTime.now(),10.25,2000000001,110.25);
//		PaymentDTO paymentDTO2 = new PaymentDTO("1000000002", LocalDateTime.now(),20.25,2000000002,220.25);
//        PaymentDTO paymentDTO3 = new PaymentDTO("1000000003", LocalDateTime.now(),30.25,2000000003,330.25);
//        PaymentDTO paymentDTO4 = new PaymentDTO("1000000004", LocalDateTime.now(),40.25,2000000004,440.25);
//        PaymentDTO paymentDTO5 = new PaymentDTO("1000000005", LocalDateTime.now(),50.25,2000000005,550.25);
//        PaymentDTO paymentDTO6 = new PaymentDTO("1000000006", LocalDateTime.now(),-10.25,2000000006,90.25);
//        PaymentDTO paymentDTO7 = new PaymentDTO("1000000007", LocalDateTime.now(),-20.25,2000000007,80.25);
//        PaymentDTO paymentDTO8 = new PaymentDTO("1000000008", LocalDateTime.now(),-30.25,2000000008,70.25);
//        PaymentDTO paymentDTO9 = new PaymentDTO("1000000009", LocalDateTime.now(),-40.25,2000000009,60.25);
//        PaymentDTO paymentDTO10 = new PaymentDTO("10000000010", LocalDateTime.now(),-50.25,2000000010,50.25);
//        paymentDTOList.addAll(Arrays.asList(paymentDTO1,paymentDTO2,paymentDTO3,paymentDTO4,paymentDTO5,paymentDTO6,paymentDTO7,paymentDTO8,paymentDTO9,paymentDTO10));
//
//        for (PaymentDTO paymentDTO:paymentDTOList){
//            this.producerService.sendPayment(paymentDTO);
//            latch.await(60, TimeUnit.SECONDS);
//        }

        logger.info("All payment published !!");
	}
}
