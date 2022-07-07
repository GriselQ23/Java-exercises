package ejercicio2;
import javax.swing.*;
import java.util.*;

public class Interfaz_poblacion {

	public static void main(String[] args) {
		ArrayList<Poblacion> lista=new ArrayList<Poblacion>(); 
		  for(;true;){
		     String [] menu = {"Crear Estadistica","Departamento con mayor poblacion","Departamento con menor poblacion","Salir"};
		     String valor = (String) JOptionPane.showInputDialog(null, "Seleccione la opcion","Opciones",JOptionPane.DEFAULT_OPTION,null,menu,menu[0]);
		     switch(valor){
		     case "Crear Estadistica": {añadir(lista);}; break;
		     case "Departamento con mayor poblacion": max(lista); break;
		     
		     case "Departamento con menor poblacion": min(lista); break;
		     case "Salir": System.exit(0); break;
		     }
		 }
		 }
	     public static void añadir(ArrayList<Poblacion> lista)
	     {
	    	  String m[]={"La Paz","Oruro","Potosi","CBBA","SCZ","TJA","CHQUISACA","Beni","Pando"};
	    	  lista.clear();
	    	  JOptionPane.showMessageDialog(null,"Introduca total de poblacion por departamento :");
	    	  for(int i=0;i<9;i++)
	    	  {
	    	   String cad1=JOptionPane.showInputDialog(null,"# de poblacion "+m[i]);
	    	   double v=Double.parseDouble(cad1);
	    	   Poblacion obj1=new Poblacion(v,m[i]);
	    	   lista.add(obj1);
	    	  }
	    	 }
	      
	     
	    
	      public static void max(ArrayList<Poblacion> lista)
	      {
	       double pobla=lista.get(0).getPobla();
	       double tem;
	       String dpdo=lista.get(0).getDpdo();
	       for(Poblacion tmp:lista)
	       {
	        tem=tmp.getPobla();
	        if(tem>=pobla)
	        {
	         pobla=tem;
	         dpdo=tmp.getDpdo();
	        }
	       }
	       JOptionPane.showMessageDialog(null, "LA mayor Poblaion es de "+pobla+" Habitantes en el Departamento de "+dpdo);
	      }
	      public static void min(ArrayList<Poblacion> lista)
	      {
	       double pobla=lista.get(0).getPobla();
	       double tem;
	       String dpdo=lista.get(0).getDpdo();
	       for(Poblacion tmp:lista)
	       {
	        tem=tmp.getPobla();
	        if(tem<=pobla)
	        {
	         pobla=tem;
	         dpdo=tmp.getDpdo();
	        }
	       }
	       JOptionPane.showMessageDialog(null, "La poblacion minima es de  "+pobla+" habitantes en el departamento de: "+dpdo);

	}

}
