package modelo;

import java.util.ArrayList;

public class Usuario {

    private int idUsuario;
    private String userName;
    private String contrasenia;
    private String nombre;
    private String apellido1;
    private String apellido2;
    private Fecha fechaNac;
    private String tipo;
    private ArrayList<Contenido> contenidoVisualizado;

    public Usuario(int idUsuario, String userName, String contrasenia, String nombre, String apellido1, String apellido2, Fecha fechaNac, String tipo) {

        this.idUsuario = idUsuario;
        this.userName = userName;
        this.contrasenia = contrasenia;
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.fechaNac = fechaNac;
        this.tipo = tipo;
        this.contenidoVisualizado = new ArrayList<>(); // Inicializa el ArrayList
    }

	//GETS

	public int getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getContrasenia() {
		return contrasenia;
	}

	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}

	public String getNombre() {
		return nombre;
	}

	//SETS
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido1() {
		return apellido1;
	}

	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}

	public String getApellido2() {
		return apellido2;
	}

	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}

	public Fecha getFechaNac() {
		return fechaNac;
	}

	public void setFechaNac(Fecha fechaNac) {
		this.fechaNac = fechaNac;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public ArrayList<Contenido> getContenidoVisualizado() {
		return contenidoVisualizado;
	}

	public void setContenidoVisualizado(ArrayList<Contenido> contenidoVisualizado) {
		this.contenidoVisualizado = contenidoVisualizado;
	}

}
