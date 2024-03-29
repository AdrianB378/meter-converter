package com.todocodeacademy.meterconverter;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@EnableDiscoveryClient
@ComponentScan("com.todocodeacademy")
public class MeterConverterApplication {

	public static void main(String[] args) {
		SpringApplication.run(MeterConverterApplication.class, args);
	}



}
