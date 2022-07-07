package ejercicio5;

public class Automovil extends Vehiculo{
	private String tipau;
 

 public Automovil(int ru, int capcag, String tipau) {
		super(ru, capcag);
		this.tipau = tipau;
	}


public String toString (){
    return "\n Numero de ruedas: "+ru+"\n Capacidad de Carga: "+capcag+" personas"+"\n Modelo del auto"+tipau;
				 }  
}

