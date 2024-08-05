package modelo;

import java.util.ArrayList;

public class Documental extends Contenido{

	private String tipo;

	public Documental(int idContenido, String titulo, Fecha fecha_lanzamiento,
			int duracion, String genero, float imbdRating, float imbdVotes, String tipo) {
		super(idContenido, titulo, fecha_lanzamiento,
				 duracion, genero, imbdRating, imbdVotes); 
		
		this.tipo = tipo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public void insertarContenido(ArrayList<Documental> documental, Documental documental_a_insertar){
			documental.add(documental_a_insertar);
	}

}
