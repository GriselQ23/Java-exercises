package ejercicio6;

public class Admi extends Empleado {
	
	protected double salario = 5000;

	public Admi(String nombre, int cI, String dependencia, double salario) {
		super(nombre, cI, dependencia);
		this.salario = salario;
	}
	
	
}

