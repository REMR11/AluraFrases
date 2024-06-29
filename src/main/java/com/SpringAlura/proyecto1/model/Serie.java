package com.SpringAlura.proyecto1.model;

import jakarta.persistence.*;


@Entity
@Table(name = "serie")
public class Serie {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long Id;
	private String titulo;
	private String poster;
	private String fraseIconica;
	private String personaje;
	
	public Serie() {}
	public Serie(DatosSerie pDatosSerie) {
		this.titulo = pDatosSerie.titulo();
		this.poster = pDatosSerie.poster();
		this.fraseIconica = pDatosSerie.fraseIconica();
		this.personaje = pDatosSerie.personaje();
		
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Serie [Id=");
		builder.append(Id);
		builder.append(", ");
		if (titulo != null) {
			builder.append("titulo=");
			builder.append(titulo);
			builder.append(", ");
		}
		if (poster != null) {
			builder.append("poster=");
			builder.append(poster);
			builder.append(", ");
		}
		if (fraseIconica != null) {
			builder.append("fraseIconica=");
			builder.append(fraseIconica);
			builder.append(", ");
		}
		if (personaje != null) {
			builder.append("personaje=");
			builder.append(personaje);
		}
		builder.append("]");
		return builder.toString();
	}
	/**
	 * @return the id
	 */
	public long getId() {
		return Id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		Id = id;
	}
	/**
	 * @return the titulo
	 */
	public String getTitulo() {
		return titulo;
	}
	/**
	 * @param titulo the titulo to set
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	/**
	 * @return the poster
	 */
	public String getPoster() {
		return poster;
	}
	/**
	 * @param poster the poster to set
	 */
	public void setPoster(String poster) {
		this.poster = poster;
	}
	/**
	 * @return the fraseIconica
	 */
	public String getFraseIconica() {
		return fraseIconica;
	}
	/**
	 * @param fraseIconica the fraseIconica to set
	 */
	public void setFraseIconica(String fraseIconica) {
		this.fraseIconica = fraseIconica;
	}
	/**
	 * @return the personaje
	 */
	public String getPersonaje() {
		return personaje;
	}
	/**
	 * @param personaje the personaje to set
	 */
	public void setPersonaje(String personaje) {
		this.personaje = personaje;
	}
	
	
}
