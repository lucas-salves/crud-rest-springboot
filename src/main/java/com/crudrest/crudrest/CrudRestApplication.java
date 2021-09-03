package com.crudrest.crudrest;

import java.util.stream.LongStream;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.crudrest.crudrest.repository.ContactRepository;

@SpringBootApplication
public class CrudRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudRestApplication.class, args);
	}

	
	
}
