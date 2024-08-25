package modelo;

public class Fecha {

	private int dia;
	private int mes;
	private int anyo;
	
	public int getDia() {
		return this.dia;
	}
	public void setDia(int dia) {
		this.dia = dia;
	}
	public int getMes() {
		return this.mes;
	}
	public void setMes(int mes) {
		this.mes = mes;
	}
	public int getAnyo() {
		return this.anyo;
	}
	public void setAnyo(int anyo) {
		this.anyo = anyo;
	}

	public void setFecha(int dia, int mes, int anyo){
		this.setDia(dia);
		this.setMes(mes);
		this.setAnyo(anyo);
	}
	
	@Override
	public String toString() {
		return  dia + " / " + mes + " / " + anyo ;
	}
}
