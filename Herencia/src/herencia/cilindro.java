package herencia;

public class cilindro extends circulo {
	protected double altura;
	public cilindro(double radio,double altura) {
		super(radio);
		this.altura=altura;
		
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public double cilindro_area() {
		double lateral=0;
		double base =0;
		double total =0;
		
		lateral=2*3.14*radio*altura;
		base=3.14*(radio*radio);
		total=2*base+lateral;
		return total;
		
		
	}
	public double volumen() {
		double base =0;
		base=3.14*(radio*radio);
		double volumen=base*altura;
		volumen =base*altura;
		return volumen;
	}
	
	public String toString() {
		return "El area de un cilindro es " +cilindro_area()+ "el volumen es  "+volumen();
	}
	
	
	

}
