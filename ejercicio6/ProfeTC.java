package ejercicio6;

public class ProfeTC extends Docente {

	private double califAsig;
	private String nivel;
	

	


	public ProfeTC(String nombre, int cI, String dependencia, double salario, double califAsig, String nivel) {
		super(nombre, cI, dependencia, salario);
		this.califAsig = califAsig;
		this.nivel = nivel;
	}

	public void calcularSalario() {
		if (nivel.equals("Pregrado")) salario = 10000;
		else if (nivel.equals("Maestria")) salario = 18000;
		else salario = 25000;
		if (califAsig > 4.5) salario+=2000;
	}
	
	public String toString() {
		return super.toString()+"\nCalificacion Asignada: "+califAsig+"\nNivel: "+nivel+"\n\nSalario: "+salario;
	}
}

