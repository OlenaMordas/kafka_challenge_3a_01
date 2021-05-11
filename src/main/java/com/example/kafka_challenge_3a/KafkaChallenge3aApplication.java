package com.example.kafka_challenge_3a;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.example.kafka_challenge_3a", "io.reflectoring.model"})
public class KafkaChallenge3aApplication {

	public static void main(String[] args) {
		SpringApplication.run(KafkaChallenge3aApplication.class, args);
	}

}
