package modelo;

public class Valoracion {

    private int idValoracion;
    private Contenido contenido;
    private Usuario usuario;
    private int segundosVisualizados;
    private double estrellas;
    private Fecha fechaValoracion;

    public Valoracion(int idValoracion, Contenido contenido, Usuario usuario, double estrellas, int segundosVisualizados, Fecha fechaValoracion){
        
        this.idValoracion = idValoracion;
        this.contenido = contenido;
        this.usuario = usuario;
        this.segundosVisualizados = segundosVisualizados;
        this.estrellas = estrellas;
        this.fechaValoracion = fechaValoracion;
        
    }

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
    public double getEstrellas() {
        return estrellas;
    }
    public void setEstrellas(double estrellas) {
        this.estrellas = estrellas;
    }
    public Fecha getFechaValoracion() {
        return fechaValoracion;
    }
    public void setFechaValoracion(Fecha fechaValoracion) {
        this.fechaValoracion = fechaValoracion;
    }

}
