package cristoflix;
import java.util.ArrayList;

/*import modelo.Fecha;
import modelo.Pelicula;
import modelo.Documental;*/
import modelo.*;
/*import modelo.Contenido;
import modelo.Usuario;
import modelo.Valoracion;*/

public class Main {

	public static void main(String[] args) {
		
		Fecha f1 = new Fecha ();
		Fecha f2 = new Fecha ();
		f1.setDia(19);
		f1.setMes(12);
		f1.setAnyo(2001);
		
		//System.out.println(f1);
		//System.out.println(f2);

		Usuario u1 = new Usuario(0, "senna", "si", "Cristina", "López", "Cabrera", f1, "admin");
		System.out.println("El ID de usuario de " + u1.getUserName() + " es " +  u1.getIdUsuario());
		Pelicula p1 = new Pelicula(1, "pelichula", f2, 150, "otaku", 10, 1	, "yo");

		new ArrayList<>(); //como coño se usa esto;

		final int DIM = 100;
		int v_prueba[] = {0, 1, 2};
	}

}
