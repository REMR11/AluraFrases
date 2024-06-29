package com.SpringAlura.proyecto1.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SpringAlura.proyecto1.model.DatosSerie;
import com.SpringAlura.proyecto1.model.Serie;
import com.SpringAlura.proyecto1.repository.SerieRepository;

@Service
public class SerieService {
	@Autowired
	private SerieRepository repository;

	public DatosSerie getRandomPhase() {
		Serie s = repository.getRandomPhrase();
		return new DatosSerie(s.getTitulo(), s.getPoster(), s.getFraseIconica(), s.getPersonaje());

	}

}
