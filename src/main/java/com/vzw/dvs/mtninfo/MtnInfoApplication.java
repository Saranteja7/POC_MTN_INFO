package com.vzw.dvs.mtninfo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@EnableEurekaClient
@SpringBootApplication
public class MtnInfoApplication {

	public static void main(String[] args) {
		SpringApplication.run(MtnInfoApplication.class, args);
	}

}
