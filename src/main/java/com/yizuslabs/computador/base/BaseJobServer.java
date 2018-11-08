package com.yizuslabs.computador.base;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableAutoConfiguration
//@EnableDiscoveryClient
@SpringBootApplication
public class BaseJobServer {

	public static void main(String[] args) {
		SpringApplication.run(BaseJobServer.class, args);
	}
}
