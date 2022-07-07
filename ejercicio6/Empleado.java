package ejercicio6;

public class Empleado {

	protected String nombre;
	protected int CI;
	protected String dependencia;


	public Empleado(String nombre, int cI, String dependencia) {
		super();
		this.nombre = nombre;
		CI = cI;
		this.dependencia = dependencia;
	}


	public String toString() {
		return "Nombre: "+nombre+"\nCI: "+CI+"\nDependencia: Facultad de "+dependencia;		
	}
}
