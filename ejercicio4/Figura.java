package ejercicio4;
import javax.swing.*;
public class Figura {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
			int a=0;
		for (;true;){
			String [] opciones={"CUADRADO","PARALELEPIPEDO","salir"};
			String var=(String)JOptionPane.showInputDialog(null,"Elegir opcion", "MENU",JOptionPane.DEFAULT_OPTION,null,opciones,opciones [0]);
			switch(var){
			case"CUADRADO":
				 a=Integer.parseInt(JOptionPane.showInputDialog("Introdusca un lado"));
				Cuadrado obj=new Cuadrado (a);
				JOptionPane.showMessageDialog(null, obj);
				break;
			case "PARALELEPIPEDO":
				 a=Integer.parseInt(JOptionPane.showInputDialog("Introdusca un lado"));
				int b=Integer.parseInt(JOptionPane.showInputDialog("Introdusca un lado"));
				int c=Integer.parseInt(JOptionPane.showInputDialog("Introdusca un lado diferente al anterior"));
				Paralelepipedo obj1= new Paralelepipedo (a,b,c);
				JOptionPane.showMessageDialog(null, obj1);
				break;
			
			case "salir": System.exit (0);

	}
		}
	}
}
			




