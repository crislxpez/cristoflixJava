package modelo;

public class Contenido {

	protected int idContenido;
	protected String titulo;
	protected Fecha fechaLanzamiento;
	protected int duracion;
	protected String genero;
	protected float imbdRating;
	protected float imbdVotes;
	protected int timesPlayed;
	protected int timesLiked;
	protected int timesNotLiked;
	protected float cristoflixRating;
	protected boolean activo;
	
	public int getIdContenido() {
		return idContenido;
	}

	public void setIdContenido(int idContenido) {
		this.idContenido = idContenido;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Fecha getFechaLanzamiento() {
		return fechaLanzamiento;
	}

	public void setFechaLanzamiento(Fecha fechaLanzamiento) {
		this.fechaLanzamiento = fechaLanzamiento;
	}

	public int getDuracion() {
		return this.duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	public String getGenero() {
		return this.genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public float getImbdRating() {
		return this.imbdRating;
	}

	public void setImbdRating(float imbdRating) {
		this.imbdRating = imbdRating;
	}

	public float getImbdVotes() {
		return this.imbdVotes;
	}

	public void setImbdVotes(float imbdVotes) {
		this.imbdVotes = imbdVotes;
	}

	public int getTimesPlayed() {
		return this.timesPlayed;
	}

	public void setTimesPlayed(int timesPlayed) {
		this.timesPlayed = timesPlayed;
	}

	public int getTimesLiked() {
		return this.timesLiked;
	}

	public void setTimesLiked(int timesLiked) {
		this.timesLiked = timesLiked;
	}

	public int getTimesNotLiked() {
		return this.timesNotLiked;
	}

	public void setTimesNotLiked(int timesNotLiked) {
		this.timesNotLiked = timesNotLiked;
	}

	public float getCristoflixRating() {
		return this.cristoflixRating;
	}

	public void setCristoflixRating(float cristoflixRating) {
		this.cristoflixRating = cristoflixRating;
	}

	public boolean isActivo() {
		return this.activo;
	}

	public void setActivo(boolean activo) {
		this.activo = activo;
	}

	
	public Contenido(int idContenido, String titulo, Fecha fecha_lanzamiento,
			int duracion, String genero, float imbdRating, float imbdVotes, int timesPlayed, int timesLiked, int timesNotLiked, float cristoflixRating) {
		
		this.idContenido = idContenido;
		this.titulo = titulo;
		this.fechaLanzamiento = fecha_lanzamiento;
		this.duracion = duracion;
		this.genero = genero;
		this.imbdRating = imbdRating;
		this.imbdVotes = imbdVotes;
		this.timesPlayed = timesPlayed;
		this.timesLiked = timesLiked;
		this.timesNotLiked = timesNotLiked;
		this.cristoflixRating = cristoflixRating;

	}
}

