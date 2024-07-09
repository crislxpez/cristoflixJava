package modelo;

public class Pelicula extends Contenido {

	private String director;

	public Pelicula(int idContenido, String titulo, Fecha fecha_lanzamiento,
			int duracion, String genero, float imbdRating, float imbdVotes, String director) {
		super(idContenido, titulo, fecha_lanzamiento,
				 duracion, genero, imbdRating, imbdVotes); 
		
		this.director = director;
	}

	public String getDirector() {
		return this.director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

}
