package circulo;

import javax.swing.JOptionPane;

public class Circulo {

	public static void main(String[] args) {
		int r=0;
		r=Integer.parseInt(JOptionPane.showInputDialog("Introduzca el radio"));
		cilindro obj=new cilindro (r);
		JOptionPane.showMessageDialog(null, obj);

	}

}
