package modelo;

import java.util.ArrayList;

public class Serie extends Contenido {
	
	private int numCaps;

	public Serie(int idContenido, String titulo, Fecha fechaLanzamiento,
			int duracion, String genero, float imbdRating, float imbdVotes, int numCaps) {
		super( idContenido, titulo, fechaLanzamiento,
				 duracion, genero, imbdRating, imbdVotes); 
		this.numCaps = numCaps;
	}

	public int getNumCaps() {
		return this.numCaps;
	}

	public void setNumCaps(int numCaps) {
		this.numCaps = numCaps;
	}

	public void insertarContenido(ArrayList<Serie> serie, Serie serie_a_insertar){
			serie.add(serie_a_insertar);
	}
}
