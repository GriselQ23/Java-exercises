package herencia;

public class circulo {
	protected double radio;
	public circulo(double radio) {
		//super();
		this.radio=radio;
	}



public double getRadio() {
		return radio;
	}



	public void setRadio(double radio) {
		this.radio = radio;
	}



public double area_cil() {
	double s=0;
	//s=Math.pow(Math.PI*r,r);
	s=3.14*radio*radio;	
	return s;
}
public String toString() {
	return "El area del circulo es" +area_cil();
}


}
