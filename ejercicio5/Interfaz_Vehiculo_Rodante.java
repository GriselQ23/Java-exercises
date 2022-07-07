package ejercicio5;

import javax.swing.JOptionPane;


public class Interfaz_Vehiculo_Rodante {
	public static void main(String args []){
		int ru=0,car=0;
	for (;true;){
		String [] opciones={"automovil","camion","cambiar datos camion","salir"};
		String var=(String)JOptionPane.showInputDialog(null,"Elegir opcion", "MENU",JOptionPane.DEFAULT_OPTION,null,opciones,opciones [0]);
		switch(var){
		case"automovil":
			ru=Integer.parseInt(JOptionPane.showInputDialog("INTRODUCIR EL NUMERO DE RUEDAS"));
		    car=Integer.parseInt(JOptionPane.showInputDialog("INTRODUCIR LA CANTIDAD DE CARGA (PERSONAS)"));
			String mo=(JOptionPane.showInputDialog("INTRODUCIR EL MODELO DE AUTO"));
		    Automovil obj1=new Automovil(ru,car,mo);
			JOptionPane.showMessageDialog(null, obj1);
			break;
		case"camion":
			ru=Integer.parseInt(JOptionPane.showInputDialog("INTRODUCIR EL NUMERO DE RUEDAS"));
		    car=Integer.parseInt(JOptionPane.showInputDialog("INTRODUCIR LA CANTIDAD DE CARGA (PERSONAS)"));
		    int cant=Integer.parseInt(JOptionPane.showInputDialog("INTRODUCIR LA CANTIDAD DE CARGA"));
			Camion obj2=new Camion (ru,car,cant);
			JOptionPane.showMessageDialog(null, obj2);
			break;

		case "salir": System.exit (0);
		
			}
		}
	}
}
