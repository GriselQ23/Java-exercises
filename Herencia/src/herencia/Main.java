package herencia;

import javax.swing.JOptionPane;



public class Main {

	public static void main(String[] args) {
		int radio=0;
		radio=Integer.parseInt(JOptionPane.showInputDialog("Introduzca el radio"));
		circulo obj=new circulo (radio);
		JOptionPane.showMessageDialog(null, obj);
		
		int altura=0;
		altura=Integer.parseInt(JOptionPane.showInputDialog("Introduzca el altura"));
		cilindro obj2 = new cilindro (altura, radio);
		JOptionPane.showMessageDialog(null, obj2);
		

	}

}
