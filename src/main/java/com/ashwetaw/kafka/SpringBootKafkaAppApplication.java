package com.ashwetaw.kafka;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RequiredArgsConstructor
public class SpringBootKafkaAppApplication{

	public static void main(String[] args) {
		SpringApplication.run(SpringBootKafkaAppApplication.class, args);
	}


}
