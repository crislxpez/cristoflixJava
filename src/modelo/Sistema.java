package modelo;

import java.util.ArrayList;

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

            System.out.println("Bienvenido al cristoflix no tan bueno de Java!!(Es mejor C++)");
            System.out.println("1. Iniciar Sesion");
    }
}
