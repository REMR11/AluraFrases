package com.SpringAlura.proyecto1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.SpringAlura.proyecto1.model.Serie;

public interface SerieRepository extends JpaRepository<Serie, Long> {

	@Query("SELECT s FROM Serie s order by function('RANDOM') LIMIT 1")
	public Serie getRandomPhrase();
}
