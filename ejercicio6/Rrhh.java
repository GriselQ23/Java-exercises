package ejercicio6;

public class Rrhh extends Admi {

	private String tipo;
	

	public Rrhh(String nombre, int cI, String dependencia, double salario, String tipo) {
		super(nombre, cI, dependencia, salario);
		this.tipo = tipo;
	}

	public void calcularSalario() {
		if (tipo.equals("Tesoreria")) salario+=1000;
		else salario+=700;
	}
	
	public String toString() {
		return super.toString()+"\nTipo: "+tipo+"\n\nSalario: "+salario;
	}
}

