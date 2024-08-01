package modelo;

public class Valoracion {

    private int idValoracion;
    private Contenido contenido;
    private Usuario usuario;
    private int segundosVisualizados;
    private float estrellas;
    private Fecha fechaValoracion;
    private boolean debug;

    public int getIdValoracion() {
        return idValoracion;
    }
    public void setIdValoracion(int idValoracion) {
        this.idValoracion = idValoracion;
    }
    public Contenido getContenido() {
        return contenido;
    }
    public void setContenido(Contenido contenido) {
        this.contenido = contenido;
    }
    public Usuario getUsuario() {
        return usuario;
    }
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    public int getSegundosVisualizados() {
        return segundosVisualizados;
    }
    public void setSegundosVisualizados(int segundosVisualizados) {
        this.segundosVisualizados = segundosVisualizados;
    }
    public float getEstrellas() {
        return estrellas;
    }
    public void setEstrellas(float estrellas) {
        this.estrellas = estrellas;
    }
    public Fecha getFechaValoracion() {
        return fechaValoracion;
    }
    public void setFechaValoracion(Fecha fechaValoracion) {
        this.fechaValoracion = fechaValoracion;
    }
    public boolean isDebug() {
        return debug;
    }
    public void setDebug(boolean debug) {
        this.debug = debug;
    }

    }
