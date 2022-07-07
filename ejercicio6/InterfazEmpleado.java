package ejercicio6;

import javax.swing.JOptionPane;

public class InterfazEmpleado {

	public static void main(String[] args) {
		while (true) {
			String opc[] = {"Docente","Administrativo","Salir del programa"};
			String cad = (String) JOptionPane.showInputDialog(null, "Seleccione el tipo de empleado con el que desea operar", "Empleado", JOptionPane.QUESTION_MESSAGE, null, opc, opc[0]);
			switch (cad) {
			case "Docente": docente(); break;
			case "Administrativo": administrativo(); break;
			case "Salir del programa": System.exit(0); break;
			}
		}
	}
	
	public static void docente() {
		String opc[] = {"Profesor a Tiempo Completo","Profesor por Hora de Catedra"};
		String cad = (String) JOptionPane.showInputDialog(null, "Seleccione el tipo de docente con el que desea operar", "Docente", JOptionPane.QUESTION_MESSAGE, null, opc, opc[0]);
		switch (cad) {
		case "Profesor a Tiempo Completo": docente(); break;
		case "Profesor por Hora de Catedra": administrativo(); break;
		case "Salir del programa": System.exit(0); break;
		}
		String c1 = JOptionPane.showInputDialog(null,"Introducir la cantidad de ruedas del vehiculo:","Vehiculo Rodante",JOptionPane.QUESTION_MESSAGE);
		String c2 = JOptionPane.showInputDialog(null,"Introducir la capacidad de pasajeros del vehiculo:","Vehiculo Rodante",JOptionPane.QUESTION_MESSAGE);
		Empleado p = new Empleado (Integer.parseInt(c1),Integer.parseInt(c2));
		JOptionPane.showMessageDialog(null, p ,"Resultados", JOptionPane.INFORMATION_MESSAGE);
	}
	
	public static void administrativo() {
		
	}


}

