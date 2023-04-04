package com.nttdata.mscreditcard;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
public class MsCreditcardApplication implements ApplicationRunner {

	public static void main(String[] args) {
		SpringApplication.run(MsCreditcardApplication.class, args);
	}
	private static final Logger logger = LogManager.getLogger(MsCreditcardApplication.class);
	@Override
	public void run(ApplicationArguments args) throws Exception {
	}
}
