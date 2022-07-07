package circulo;


public class cilindro{
	protected double r; 
	


public cilindro(int r) {
		super();
		this.r=r;
	}



public double getR() {
		return r;
	}



	public void setR(double r) {
		this.r = r;
	}



public double area_cil() {
	double s=0;
	//s=Math.pow(Math.PI*r,r);
	s=3.14*r*r;	
	return s;
}
public String toString() {
	return "El area del circulo es" +area_cil();
}


}
