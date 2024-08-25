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
	private boolean estado;
    private ArrayList<Contenido> v_contenido_visualizado;
    private ArrayList<Contenido> v_contenido_mg;
    private ArrayList<Contenido> v_contenido_nomg;
    private ArrayList<Contenido> v_contenido_buscado;
    private ArrayList<Contenido> v_contenido_valorado;



	public Usuario(){

	}

    public Usuario(int idUsuario, String userName, String contrasenia, String nombre, String apellido1, String apellido2, Fecha fechaNac, String tipo, boolean estado) {

        this.idUsuario = idUsuario;
        this.userName = userName;
        this.contrasenia = contrasenia;
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.fechaNac = fechaNac;
        this.tipo = tipo;
		this.estado = estado;
        this.v_contenido_visualizado = new ArrayList<Contenido>();
        this.v_contenido_mg = new ArrayList<Contenido>();
        this.v_contenido_nomg = new ArrayList<Contenido>();
        this.v_contenido_buscado = new ArrayList<Contenido>();
        this.v_contenido_valorado = new ArrayList<Contenido>();


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

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

	public Contenido getContenidoVisualizado(int i) {
		return this.v_contenido_visualizado.get(i);
	}
	public Contenido getContenidoMg(int i) {
		return this.v_contenido_mg.get(i);
	}
	public Contenido getContenidoNomg(int i) {
		return this.v_contenido_nomg.get(i);
	}
	public Contenido getContenidoBuscado(int i) {
		return this.v_contenido_buscado.get(i);
	}

	public Contenido getContenidoValorado(int i) {
		return this.v_contenido_valorado.get(i);
	}

	public void insertarContenido(ArrayList<Contenido> contenido, Contenido contenido_a_insertar){
			contenido.add(contenido_a_insertar);
	}

	public ArrayList<Contenido> getVContenidoVisualizado(){
		return this.v_contenido_visualizado;
	}
	public ArrayList<Contenido> getVContenidoMg(){
		return this.v_contenido_mg;
	}
	public ArrayList<Contenido> getVContenidoNomg(){
		return this.v_contenido_nomg;
	}
	public ArrayList<Contenido> getVContenidoBuscado(){
		return this.v_contenido_buscado;
	}
	public ArrayList<Contenido> getVContenidoValorado(){
		return this.v_contenido_valorado;
	}

	public void setDatosUsuario(int id, String userName, String contrasenia, String nombre, String apellido1, String apellido2, Fecha fecha_nac, String tipo, boolean activo){

		this.setIdUsuario(id);
		this.setUserName(userName);
		this.setContrasenia(contrasenia);
		this.setNombre(nombre);
		this.setApellido1(apellido1);
		this.setApellido2(apellido2);
		this.setFechaNac(fecha_nac);
		this.setTipo(tipo);
		this.setEstado(activo);
	}

}
