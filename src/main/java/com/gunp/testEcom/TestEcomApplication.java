package com.gunp.testEcom;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class TestEcomApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestEcomApplication.class, args);
	}

//	@Bean
//	public CommandLineRunner demo(ProductRepo productRepo){
//		return (args ->{
//			productRepo.save(new Product("Jackfruit","Fruit"));
//		} );
//	}
}
