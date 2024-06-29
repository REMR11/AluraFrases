package com.SpringAlura.proyecto1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.SpringAlura.proyecto1.principal.Principal;
import com.SpringAlura.proyecto1.repository.SerieRepository;

@SpringBootApplication
public class AluraFrasesApplication implements CommandLineRunner{

	@Autowired
	private SerieRepository repository;
	public static void main(String[] args) {
		SpringApplication.run(AluraFrasesApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Principal principal = new Principal(repository);
		principal.muestraElMenu();
	}

}
