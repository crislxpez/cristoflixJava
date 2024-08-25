package modelo;

import java.util.ArrayList;
import java.util.Scanner;

public class Sistema {
    
    ArrayList<Usuario>v_usuarios_sistema;
    ArrayList<Contenido>v_contenidos_sistema;
    ArrayList<Valoracion>v_valoraciones_sistema;

    int last_user_id;
    int last_content_id;
    int last_assessment_id;

    int totalPlayed;
    int totalValorated;
    int totalLikes;
    int totalUnlikes;

    Usuario usuario_logeado;

    public Sistema() {

        this.v_usuarios_sistema = new ArrayList<Usuario>();
        this.v_contenidos_sistema = new ArrayList<Contenido>();
        this.v_valoraciones_sistema = new ArrayList<Valoracion>();

        this.last_user_id = 0;
        this.last_content_id = 0;
        this.last_assessment_id = 0;

        this.totalPlayed = 0;
        this.totalValorated = 0;
        this.totalLikes = 0;
        this.totalUnlikes = 0;
    }

    public void menu(){

        Scanner entrada = new Scanner(System.in);
        int opcion = 0;
        System.out.print("Introduce un número: ");
        opcion = entrada.nextInt();
        entrada.close();
        System.out.println(opcion);
        System.out.println("Bienvenido al cristoflix no tan bueno de Java!!(Es mejor C++)");
        System.out.println("1. Iniciar Sesion");
    }
    private Usuario getUsuarioSistema(int i) {
		return v_usuarios_sistema.get(i);
	}

	private Contenido getContenidoSistema(int i) {
		return v_contenidos_sistema.get(i);
	}

	private Valoracion getValoracionSistema(int i) {
		return v_valoraciones_sistema.get(i);
	}

	private int getLastUserId() {
		return last_user_id;
	}

	private void setLastUserId(int last_user_id) {
		this.last_user_id = last_user_id;
	}

	private int getLastContentId() {
		return last_content_id;
	}

	private void setLastContentId(int last_content_id) {
		this.last_content_id = last_content_id;
	}

	private int get_last_assessment_id() {
		return last_assessment_id;
	}

	private void setLasAssessmentId(int last_assessment_id) {
		this.last_assessment_id = last_assessment_id;
	}

	private int getTotalPlayed() {
		return totalPlayed;
	}

	private void setTotalPlayed(int totalPlayed) {
		this.totalPlayed = totalPlayed;
	}

	private int getTotalValorated() {
		return totalValorated;
	}

	private void setTotalValorated(int totalValorated) {
		this.totalValorated = totalValorated;
	}

	private int getTotalLikes() {
		return totalLikes;
	}

	private void setTotalLikes(int totalLikes) {
		this.totalLikes = totalLikes;
	}

	private int getTotalUnlikes() {
		return totalUnlikes;
	}

	private void setTotalUnlikes(int totalUnlikes) {
		this.totalUnlikes = totalUnlikes;
	}

	private Usuario getUsuarioLogeado() {
		return usuario_logeado;
	}

	private void setUsuarioLogeado(Usuario usuario_logeado) {
		this.usuario_logeado = usuario_logeado;
	}

	private void insertarContenido(Contenido c){

	}
	private void insertarUsuario(Usuario u){

	}
	private void insertarValoracion(Valoracion v){

	}
    private void cargarDatosBasicos(){

		this.setLasAssessmentId(0);
		this.setLastUserId(0);
		this.setLastContentId(0);
	
		Fecha fecha = new Fecha();
	
		fecha.setFecha(19, 10, 2014);
	
		this.insertarContenido(new Pelicula (0, "El corredor del laberinto", fecha, 113, "Ciencia Ficción", 6.8, 511000f, 0, 0, 0, 0, "Wes Ball"));
	
		fecha.setFecha(31, 06, 1999);
	
		this.insertarContenido(new Pelicula (1, "The Matrix", fecha, 136, "Ciencia Ficción", 8.7, 2100000, 0, 0, 0, 0, "Wachowski"));
	
		fecha.setFecha(03, 10, 2008);
	
		this.insertarContenido(new Serie (2, "Stars Wars: The Clone Wars", fecha, 23, "Ciencia Ficción", 8.4, 121000, 0, 0, 0, 0, 133));
	
		fecha.setFecha(13, 01, 1995);
	
		this.insertarContenido(new Pelicula (3, "Pulp Fiction", fecha, 154, "Crimen", 8.9, 2200000, 0, 0, 0, 0, "Quentin Tarantino"));
	
		fecha.setFecha(26, 07, 2019);
	
		this.insertarContenido(new Serie (4, "The boys", fecha, 60, "Accion", 8.7, 656000, 0, 0, 0, 0, 24));
	
		fecha.setFecha(06, 9, 2003);
	
		this.insertarContenido(new Serie (5, "One piece", fecha, 20, "Animacion", 8.7, 2100000, 0, 0, 0, 0, 1055));
	
		fecha.setFecha(25, 04, 2019);
	
		this.insertarContenido(new Pelicula (6, "Vengadores: Endgame", fecha, 143, "Accion", 8.7, 1300000, 0, 0, 0, 0, "Anthony y Joe Russo"));
	
		fecha.setFecha(8, 01, 2021);
	
		this.insertarContenido(new Serie (7, "Lupin", fecha, 60, "Crimen", 7.5, 139000, 0, 0, 0, 0, 10));
	
		fecha.setFecha(02, 05, 2017);
	
		this.insertarContenido(new Serie (8, "La casa de papel", fecha, 45, "Crimen", 8.2, 534000, 0, 0, 0, 0, 41));
	
		fecha.setFecha(11, 07, 2016);
	
		this.insertarContenido(new Serie (9, "Stranger Things", fecha, 60, "Fantasia", 8.7, 1300000, 0, 0, 0, 0, 34));
	
		fecha.setFecha(25, 10, 2023);
	
		this.insertarContenido(new Documental (10, "La vida en nuestro planeta", fecha, 432, "Naturaleza", 8.1, 5600, 0, 0, 0, 0, "Historia"));
	
		Usuario u = new Usuario();
	
		fecha.setFecha(14, 8, 1999);
	
		u.setDatosUsuario(0, "night-man", "jdfs", "Jose David", "Sanchez", "Fernandez", fecha, "cliente", true);
	
		u.insertarContenido(u.getVContenidoVisualizado(),this.getContenidoSistema(5));
		u.insertarContenido(u.getVContenidoVisualizado(),this.getContenidoSistema(3));
		u.insertarContenido(u.getVContenidoVisualizado(),this.getContenidoSistema(1));
		u.insertarContenido(u.getVContenidoVisualizado(),this.getContenidoSistema(10));
	
		u.insertarContenido(u.getVContenidoMg(), this.getContenidoSistema(3));
		u.insertarContenido(u.getVContenidoMg(), this.getContenidoSistema(5));
	
		u.insertarContenido(u.getVContenidoNomg(), this.getContenidoSistema(7));
	
		u.insertarContenido(u.getVContenidoValorado(), this.getContenidoSistema(3));
		u.insertarContenido(u.getVContenidoValorado(), this.getContenidoSistema(5));
		u.insertarContenido(u.getVContenidoValorado(), this.getContenidoSistema(1));
		u.insertarContenido(u.getVContenidoValorado(), this.getContenidoSistema(10));
	
		this.insertarUsuario(u);
	
		u = new Usuario();
	
		fecha.setFecha(10, 06, 2004);
	
		u.setDatosUsuario(1, "ice-man", "gatogordo", "Pablo", "Guardia", "Castro", fecha, "admin", true);
	
		u.insertarContenido(u.getVContenidoVisualizado(),this.getContenidoSistema(6));
	
		u.insertarContenido(u.getVContenidoMg(), this.getContenidoSistema(6));
	
		u.insertarContenido(u.getVContenidoValorado(), this.getContenidoSistema(6));
	
		this.insertarUsuario(u);
	
	
		u = new Usuario();
	
		fecha.setFecha(29, 10, 2001);
	
		u.setDatosUsuario(2, "dfpm", "halaMadrid10", "David Francesc", "Pons", "Moll", fecha, "cliente", true);
	
		u.insertarContenido(u.getVContenidoVisualizado(),this.getContenidoSistema(5));
	
		u.insertarContenido(u.getVContenidoMg(), this.getContenidoSistema(5));
	
		u.insertarContenido(u.getVContenidoNomg(), this.getContenidoSistema(7));
		u.insertarContenido(u.getVContenidoNomg(), this.getContenidoSistema(2));
	
		u.insertarContenido(u.getVContenidoValorado(), this.getContenidoSistema(5)); 
	
		this.insertarUsuario(u);
	
	
		u = new Usuario();
	
		fecha.setFecha(24, 03, 2004);
	
		u.setDatosUsuario(3, "sergio24m", "242424", "Sergio", "Contreras", "Lucas", fecha, "cliente", true);
	
		u.insertarContenido(u.getVContenidoVisualizado(),this.getContenidoSistema(2));
	
		u.insertarContenido(u.getVContenidoMg(), this.getContenidoSistema(2));
	
		u.insertarContenido(u.getVContenidoValorado(), this.getContenidoSistema(2));
	
		this.insertarUsuario(u);
	
	
		u = new Usuario();
	
		fecha.setFecha(28, 12, 2000);
	
		u.setDatosUsuario(4, "polgs", "ms10", "Henry Paul", "Garcia", "Simbaña", fecha, "cliente", true);
	
		u.insertarContenido(u.getVContenidoVisualizado(),this.getContenidoSistema(5));
	
		u.insertarContenido(u.getVContenidoMg(), this.getContenidoSistema(5));
	
		u.insertarContenido(u.getVContenidoNomg(), this.getContenidoSistema(7));
		u.insertarContenido(u.getVContenidoNomg(), this.getContenidoSistema(2));
	
		u.insertarContenido(u.getVContenidoValorado(), this.getContenidoSistema(5)); 
	
		this.insertarUsuario(u);
	
	
		u = new Usuario();
	
		fecha.setFecha(05, 07, 2000);
	
		u.setDatosUsuario(5, "AntMan", "aguakate9", "Antonio Manuel", "Velasco", "Rivera", fecha, "cliente", true);
	
		u.insertarContenido(u.getVContenidoVisualizado(),this.getContenidoSistema(1));
	
		u.insertarContenido(u.getVContenidoValorado(), this.getContenidoSistema(1));
	
		this.insertarUsuario(u);
	
	
		u = new Usuario();
	
		fecha.setFecha(14, 02, 2004);
	
		u.setDatosUsuario(6, "alexmrdgz", "q7r8m5", "Alejandro", "Miranda", "Rodriguez", fecha, "cliente", true);
	
		u.insertarContenido(u.getVContenidoVisualizado(),this.getContenidoSistema(0));
	
		u.insertarContenido(u.getVContenidoMg(), this.getContenidoSistema(7));
	
		u.insertarContenido(u.getVContenidoValorado(), this.getContenidoSistema(0));
	
		this.insertarUsuario(u);
	
	
	
		u = new Usuario();
	
		fecha.setFecha(12, 11, 2003);
	
		u.setDatosUsuario(7, "llamassl", "7654", "Luis", "Llamas", "Ramon", fecha, "cliente", true);
	
		u.insertarContenido(u.getVContenidoVisualizado(),this.getContenidoSistema(5));
	
		u.insertarContenido(u.getVContenidoMg(), this.getContenidoSistema(5));
	
		u.insertarContenido(u.getVContenidoValorado(), this.getContenidoSistema(5));
	
		this.insertarUsuario(u);
	
	
	
		u = new Usuario();
	
		fecha.setFecha(20, 04, 2004);
	
		u.setDatosUsuario(8, "game-master", "toilette", "Carlos", "Polo", "Martin", fecha, "cliente", true);
	
		u.insertarContenido(u.getVContenidoVisualizado(),this.getContenidoSistema(5));
		u.insertarContenido(u.getVContenidoVisualizado(),this.getContenidoSistema(1));
		u.insertarContenido(u.getVContenidoVisualizado(),this.getContenidoSistema(9));
	
		u.insertarContenido(u.getVContenidoMg(), this.getContenidoSistema(9));
		u.insertarContenido(u.getVContenidoMg(), this.getContenidoSistema(5));
	
		u.insertarContenido(u.getVContenidoNomg(), this.getContenidoSistema(1));
	
		u.insertarContenido(u.getVContenidoValorado(), this.getContenidoSistema(5));
		u.insertarContenido(u.getVContenidoValorado(), this.getContenidoSistema(1));
		u.insertarContenido(u.getVContenidoValorado(), this.getContenidoSistema(9));
	
		this.insertarUsuario(u);
	
	
	
		u = new Usuario();
	
		fecha.setFecha(21, 9, 2004);
	
		u.setDatosUsuario(9, "AlexMrtnzz21", "q100", "Alejandro", "Martinez", "Suarez", fecha, "cliente", true);
	
		u.insertarContenido(u.getVContenidoVisualizado(),this.getContenidoSistema(9));
		u.insertarContenido(u.getVContenidoVisualizado(),this.getContenidoSistema(7));
		u.insertarContenido(u.getVContenidoVisualizado(),this.getContenidoSistema(2));
	
		u.insertarContenido(u.getVContenidoValorado(), this.getContenidoSistema(9));
		u.insertarContenido(u.getVContenidoValorado(), this.getContenidoSistema(7));
		u.insertarContenido(u.getVContenidoValorado(), this.getContenidoSistema(2));
	
		this.insertarUsuario(u);
	
	
	
		u = new Usuario();
	
		fecha.setFecha(16, 03, 2004);
	
		u.setDatosUsuario(10, "AuraEqualizer", "Lupotia1600", "Maria", "Garrido", "Castellano", fecha, "cliente", true);
	
		u.insertarContenido(u.getVContenidoVisualizado(),this.getContenidoSistema(4));
	
		u.insertarContenido(u.getVContenidoMg(), this.getContenidoSistema(4));
	
		u.insertarContenido(u.getVContenidoNomg(), this.getContenidoSistema(10));
	
		u.insertarContenido(u.getVContenidoValorado(), this.getContenidoSistema(4));
	
		this.insertarUsuario(u);
	
	
	
		u = new Usuario();
	
		fecha.setFecha(21, 02, 1991);
	
		u.setDatosUsuario(11, "teffuka", "1234", "Natalia", "Serrantes", "Cortez", fecha, "cliente", true);
	
		u.insertarContenido(u.getVContenidoVisualizado(),this.getContenidoSistema(9));
	
		u.insertarContenido(u.getVContenidoNomg(), this.getContenidoSistema(7));
	
		u.insertarContenido(u.getVContenidoValorado(), this.getContenidoSistema(9));
	
		this.insertarUsuario(u);
	
	
		u = new Usuario();
	
		fecha.setFecha(16, 10, 2005);
	
		u.setDatosUsuario(12, "madridistashdp", "culeshastalamuerte", "Gonzalo", "Bouso", "Gomez", fecha, "cliente", true);
	
		u.insertarContenido(u.getVContenidoVisualizado(),this.getContenidoSistema(0));
	
		u.insertarContenido(u.getVContenidoMg(), this.getContenidoSistema(9));
		u.insertarContenido(u.getVContenidoMg(), this.getContenidoSistema(5));
	
		u.insertarContenido(u.getVContenidoValorado(), this.getContenidoSistema(0));
	
		this.insertarUsuario(u);
	
	
		u = new Usuario();
	
		fecha.setFecha(19, 12, 2001);
	
		u.setDatosUsuario(13, "kxnxdx", "gojou", "Cristina", "Lopez", "Cabrera", fecha, "cliente", true); 
	
		u.insertarContenido(u.getVContenidoVisualizado(),this.getContenidoSistema(5));
	
		u.insertarContenido(u.getVContenidoMg(), this.getContenidoSistema(1));
		u.insertarContenido(u.getVContenidoMg(), this.getContenidoSistema(5));
	
		u.insertarContenido(u.getVContenidoNomg(), this.getContenidoSistema(9));
		u.insertarContenido(u.getVContenidoNomg(), this.getContenidoSistema(7));
	
		u.insertarContenido(u.getVContenidoValorado(), this.getContenidoSistema(5)); 
	
		this.insertarUsuario(u);
	
	
		u = new Usuario();
	
		fecha.setFecha(22, 11, 1999);
	
		u.setDatosUsuario(14, "Napoleon", "221199", "Hanok", "Martin", "Exposito", fecha, "cliente", true);
	
		u.insertarContenido(u.getVContenidoVisualizado(),this.getContenidoSistema(1));
	
		u.insertarContenido(u.getVContenidoMg(), this.getContenidoSistema(1));
	
		u.insertarContenido(u.getVContenidoNomg(), this.getContenidoSistema(9));
		u.insertarContenido(u.getVContenidoNomg(), this.getContenidoSistema(4));
	
		u.insertarContenido(u.getVContenidoValorado(), this.getContenidoSistema(1)); 
	
		this.insertarUsuario(u);
	
		fecha.setFecha(07, 06, 2021);
	
		Valoracion v0 = new Valoracion(0, this.getContenidoSistema(3), this.getUsuarioSistema(0), 4.5, 2275, fecha);
		this.insertarValoracion(v0);
	
		fecha.setFecha(21, 03, 2023);
	
		Valoracion v1 = new Valoracion(1, this.getContenidoSistema(5), this.getUsuarioSistema(0), 5, 2341, fecha);
		this.insertarValoracion(v1);

		fecha.setFecha(21, 5, 2024);

		Valoracion v3 = new Valoracion(3, this.getContenidoSistema(10), this.getUsuarioSistema(0), 3.5, 1232, fecha);
		this.insertarValoracion(v3);

		fecha.setFecha(02, 12, 2020);

		Valoracion v4 = new Valoracion(4, this.getContenidoSistema(6), this.getUsuarioSistema(1), 4.5, 500, fecha);
		this.insertarValoracion(v4);


		fecha.setFecha(3, 12, 2020);

		Valoracion v5 = new Valoracion(5, this.getContenidoSistema(5), this.getUsuarioSistema(2), 4.5, 1200, fecha);
		this.insertarValoracion(v5);


		fecha.setFecha(04, 5, 2020);

		Valoracion v6 = new Valoracion(6, this.getContenidoSistema(2), this.getUsuarioSistema(3), 4.5, 1200, fecha);
		this.insertarValoracion(v6);

		fecha.setFecha(4, 11, 2021);

		Valoracion v7 = new Valoracion(7, this.getContenidoSistema(5), this.getUsuarioSistema(4), 4, 144000, fecha);
		this.insertarValoracion(v7);

		fecha.setFecha(5, 2, 2024);

		Valoracion v8 = new Valoracion(8, this.getContenidoSistema(1), this.getUsuarioSistema(5), 4, 136, fecha);
		this.insertarValoracion(v8);

		fecha.setFecha(12, 3, 2024);

		Valoracion v9 = new Valoracion(9, this.getContenidoSistema(0), this.getUsuarioSistema(6), 4, 3780, fecha);
		this.insertarValoracion(v9);

		fecha.setFecha(4, 4, 2021);

		Valoracion v10 = new Valoracion(10, this.getContenidoSistema(5), this.getUsuarioSistema(7), 4, 3000, fecha);
		this.insertarValoracion(v10);

		fecha.setFecha(21, 11, 2023);

		Valoracion v11 = new Valoracion(11, this.getContenidoSistema(5), this.getUsuarioSistema(8), 5, 2341, fecha);
		this.insertarValoracion(v11);

		fecha.setFecha(8, 2, 2021);

		Valoracion v12 = new Valoracion(12, this.getContenidoSistema(1), this.getUsuarioSistema(8), 4.1, 334, fecha);
		this.insertarValoracion(v12);

		fecha.setFecha(23, 03, 2018);

		Valoracion v13 = new Valoracion(13, this.getContenidoSistema(9), this.getUsuarioSistema(8), 4.3, 3600, fecha);
		this.insertarValoracion(v13);

		fecha.setFecha(1, 6, 2023);

		Valoracion v14 = new Valoracion(14, this.getContenidoSistema(9), this.getUsuarioSistema(9), 4.5, 3600, fecha);
		this.insertarValoracion(v14);

		fecha.setFecha(11, 2, 2024);

		Valoracion v15 = new Valoracion(15, this.getContenidoSistema(7), this.getUsuarioSistema(9), 4.2, 11600, fecha);
		this.insertarValoracion(v15);

		fecha.setFecha(11, 4, 2023);

		Valoracion v16 = new Valoracion(16, this.getContenidoSistema(2), this.getUsuarioSistema(9), 3.8, 8600, fecha);
		this.insertarValoracion(v16);

		fecha.setFecha(03, 11, 2023);

		Valoracion v17 = new Valoracion(17, this.getContenidoSistema(4), this.getUsuarioSistema(10), 4.45, 7800, fecha);
		this.insertarValoracion(v17);

		fecha.setFecha(1, 6, 2023);

		Valoracion v18 = new Valoracion(18, this.getContenidoSistema(9), this.getUsuarioSistema(11), 5, 3600, fecha);
		this.insertarValoracion(v18);

		Valoracion v19 = new Valoracion(19, this.getContenidoSistema(0), this.getUsuarioSistema(12), 4.5, 3780, fecha);
		this.insertarValoracion(v19);

		Valoracion v20 = new Valoracion(20, this.getContenidoSistema(5), this.getUsuarioSistema(13), 4.8, 2001, fecha);
		this.insertarValoracion(v20);

		Valoracion v21 = new Valoracion(21, this.getContenidoSistema(1), this.getUsuarioSistema(14), 3, 334, fecha);
		this.insertarValoracion(v21);

		this.setTotalLikes(16);
		this.setTotalUnlikes(12);
		this.setTotalPlayed(22);
		this.setUsuarioLogeado(this.getUsuarioSistema(1));
	
    }
    private void login(){

        Scanner entrada = new Scanner(System.in);

        String username = "";
        String contrasenia = "";
        System.out.print("Username: ");
        username = entrada.nextLine();
        entrada.nextLine();
        System.out.print("Contraseña: ");
        username = entrada.nextLine();
        
        //this.setUsuarioLogeado(u);
    }
    private boolean comprobarSiExisteUsuarioContrasenia(){

        boolean existe = false;

        return existe;
    }
}
