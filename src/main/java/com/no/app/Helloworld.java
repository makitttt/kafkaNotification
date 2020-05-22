package com.no.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan("com.no.app")
public class Helloworld {
	
	public static void main(String args[]) {
		SpringApplication.run(Helloworld.class, args);
	}

}
