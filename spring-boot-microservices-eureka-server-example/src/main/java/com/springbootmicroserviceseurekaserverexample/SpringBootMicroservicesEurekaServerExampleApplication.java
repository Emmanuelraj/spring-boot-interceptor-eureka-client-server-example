package com.springbootmicroserviceseurekaserverexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
/**
 * 
 * @author Emmanuel Raj
 * Service Registration with Eureka
 */
@SpringBootApplication
@EnableEurekaServer
@EnableDiscoveryClient
public class SpringBootMicroservicesEurekaServerExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMicroservicesEurekaServerExampleApplication.class, args);
	}

}
