package cristoflix;
import modelo.Fecha;

public class Main {

	public static void main(String[] args) {
		
		Fecha f1 = new Fecha ();
		Fecha f2 = new Fecha ();
		f1.setDia(25);
		f1.setMes(07);
		f1.setAnyo(2021);
		
		System.out.println(f1);
		System.out.println(f2);

	}

}
