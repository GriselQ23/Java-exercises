package ejercicio4;

public class Paralelepipedo extends Cuadrado {
	private int b,c;



public Paralelepipedo(int a, int b, int c) {
		super(a);
		this.b = b;
		this.c = c;
	}
public double areaParalelepipedo(){
	int s=0;
	s=2*(a*b+a*c+b*c);
	return s;
}
public int volumenPa(){
	int v=0;
	v=a*b*c;
	return v;
}
public String toString (){
	return "El area del paralelepipedo es: "+areaParalelepipedo()+" \n El volumen del paralelpipedo es: "+ volumenPa();
}
}
