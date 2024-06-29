package com.SpringAlura.proyecto1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.SpringAlura.proyecto1.model.DatosSerie;
import com.SpringAlura.proyecto1.service.SerieService;

@RestController
@RequestMapping("/series")
public class SerieController {
	
	@Autowired
	private SerieService service;
	
	@GetMapping("/frases")
	public DatosSerie getRandomPhrase() {
		return service.getRandomPhase();
	}
	
}
