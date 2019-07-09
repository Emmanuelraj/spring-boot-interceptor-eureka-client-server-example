package com.springbootmicroservicesexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
/**
 * 
 * @author Emmanuel Raj
 * Enable eureka client to register in eureka server
 */
@SpringBootApplication
@EnableEurekaClient  
public class SpringBootMicroservicesExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMicroservicesExampleApplication.class, args);
	}

}
