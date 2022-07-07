package ejercicio6;


	public class ProfeHora extends Docente {
		
		private double horasAsig;
		

		public ProfeHora(String nombre, int cI, String dependencia, double salario, double horasAsig) {
			super(nombre, cI, dependencia, salario);
			this.horasAsig = horasAsig;
		}

		public void calcularSalario() {
			salario = horasAsig*50;
		}
		
		public String toString() {
			return super.toString()+"\nHoras Asignadas: "+horasAsig+"\n\nSalario: "+salario;
		}
	}



