package modelo;

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

}
