package cristoflix;
import modelo.Fecha;
import modelo.Contenido;
import modelo.Usuario;

public class Main {

	public static void main(String[] args) {
		
		Fecha f1 = new Fecha ();
		Fecha f2 = new Fecha ();
		f1.setDia(19);
		f1.setMes(12);
		f1.setAnyo(2001);
		
		//System.out.println(f1);
		//System.out.println(f2);

		Usuario u1 = new Usuario(0, "puta", "perra", "Cristina", "López", "Cabrera", f1, "admin");
		System.out.println("El ID de usuario de " + u1.getUserName() + " es " +  u1.getIdUsuario());

	}

}
