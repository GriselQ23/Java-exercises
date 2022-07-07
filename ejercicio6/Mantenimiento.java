package ejercicio6;

public class Mantenimiento extends Admi {

	private int horasExtra;
	private String [] salonesAsig;
	

	public Mantenimiento(String nombre, int cI, String dependencia, double salario, int horasExtra,
			String[] salonesAsig) {
		super(nombre, cI, dependencia, salario);
		this.horasExtra = horasExtra;
		this.salonesAsig = salonesAsig;
	}

	public void calcularSalario() {
		salario += horasExtra*40;
	}
	
	public String toString() {
		String c = "\n";
		for (String a : salonesAsig) c+=a+"\n";
		return super.toString()+"\nHoras extra: "+horasExtra+"\nSalones Asignados: "+c+"\n\nSalario: "+salario;
	}
}

