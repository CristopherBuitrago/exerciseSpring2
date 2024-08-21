package com.apirest.api_rest;

import java.util.Scanner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.apirest.api_rest.domain.entities.Person;

import jakarta.transaction.Transactional;

@SpringBootApplication
public class ApiRestApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(ApiRestApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Transactional
	public void create(){
		Scanner scanner = new Scanner(System.in);

		System.out.println("Ingrese el nombre: ");
		String name = scanner.next();

		System.out.println("ingrese el apellido: ");
		String lastname = scanner.next();

		Person person = new Person();

		person.setFirstName(name);
		person.setLastName(lastname);

		Person newPerson = personRepository.save(person);

		System.out.println(newPerson);
	}
}
