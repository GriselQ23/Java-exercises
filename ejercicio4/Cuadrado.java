package ejercicio4;

public class Cuadrado {
	protected int a;

public Cuadrado(int a) {
		super();
		this.a = a;
	}
public int areaCua(){
	int s=0;
	s=(int)Math.pow(a, 2);
	return s;
}
public String toString (){
	return "El area del cuadrado es: "+areaCua();
}
}
