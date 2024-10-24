package com.projeto.gerenciamento_de_hotel_jpa.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "com.projeto.gerenciamento_de_hotel_jpa.model")
public class GerenciamentoDeHotelJpaApplication {
	public static void main(String[] args) {
		SpringApplication.run(GerenciamentoDeHotelJpaApplication.class, args);

	}

}
