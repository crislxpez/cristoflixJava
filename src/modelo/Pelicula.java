package modelo;

import java.util.ArrayList;

public class Pelicula extends Contenido {

	private String director;

	public Pelicula(int idContenido, String titulo, Fecha fecha_lanzamiento,
		int duracion, String genero, double imbdRating, double imbdVotes, int timesPlayed, int timesLiked, int timesNotLiked, double cristoflixRating, String director) {
		super(idContenido, titulo, fecha_lanzamiento, duracion, genero, imbdRating, imbdVotes, timesPlayed, timesLiked, timesNotLiked, cristoflixRating); 
		
		this.director = director;
	}

	public String getDirector() {
		return this.director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public void insertarContenido(ArrayList<Pelicula> pelicula, Pelicula pelicula_a_insertar){
			pelicula.add(pelicula_a_insertar);
	}

}
