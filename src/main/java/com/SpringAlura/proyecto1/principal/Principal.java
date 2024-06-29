package com.SpringAlura.proyecto1.principal;

import java.util.Optional;
import java.util.Scanner;

import org.hibernate.engine.jdbc.internal.DDLFormatterImpl;

import com.SpringAlura.proyecto1.model.DatosSerie;
import com.SpringAlura.proyecto1.model.Serie;
import com.SpringAlura.proyecto1.repository.SerieRepository;

public class Principal {
	private Scanner sc = new Scanner(System.in);
	private SerieRepository repo;
	private Optional<Serie> serieBuscada;
	
	public Principal(SerieRepository pRepository) {
		this.repo = pRepository;
	}
	
	public void muestraElMenu() {
        var opcion = -1;
        while (opcion != 0) {
            var menu = """
                    1 - Crear Frase Iconica
                    2 - Buscar episodios
                    3 - Mostrar series buscadas
                    4 - Buscar series por titulo
                    5 - Top 5 mejores series
                    6 - Buscar Series por categoría
                    7 - filtrar series por temporadas y evaluación
                    8 - Buscar episodios por titulo
                    9 - Top 5 episodios por Serie
                                  
                    0 - Salir
                    """;
            System.out.println(menu);
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                	crearFraseIconica();
                	break;
                case 0:
                    System.out.println("Cerrando la aplicación...");
                    break;
                default:
                    System.out.println("Opción inválida");
            }
        }
    }
	
	public DatosSerie getDatos() {
		System.out.println("Proporciona el titulo de la serie: ");
		var titulo = sc.nextLine();
		
		System.out.println("Proporciona poster de la serie: ");
		var poster = sc.nextLine();
		
		System.out.println("Proporciona frase iconica de la serie: ");
		var fraseIconica = sc.nextLine();
		System.out.println("Proporciona personaje que menciono esto: : ");
		var personaje = sc.nextLine();
		
		var datos = new DatosSerie(titulo, poster, fraseIconica, personaje);
		return datos;
	}
	
	public void crearFraseIconica() {
		DatosSerie datos = getDatos();
		Serie serie = new Serie(datos);
		
		repo.save(serie);
		
		System.out.println(serie.toString());
		
	}

}
