package ejercicio6;

public class Docente extends Empleado {

	protected double salario;

	public Docente(String nombre, int cI, String dependencia, double salario) {
		super(nombre, cI, dependencia);
		this.salario = salario;
	}
	

}

