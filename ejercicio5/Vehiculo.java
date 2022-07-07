package ejercicio5;

public class Vehiculo {
	protected int ru=0,capcag=0;

	public Vehiculo(int ru, int capcag) {
		super();
		this.ru = ru;
		this.capcag = capcag;
	}
	public int getRuedas(){
		return ru;
	}
	public int getCapcarga(){
		return capcag;
	}

	

}
