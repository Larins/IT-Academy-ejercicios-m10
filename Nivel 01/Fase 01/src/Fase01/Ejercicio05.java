//EJERCICIO 05
//Crea una llista amb els nombs dels mesos de l’any. Imprimeix tots els elements de la llista amb una lambda. 

package Fase01;

import java.util.Arrays;
import java.util.List;

public class Ejercicio05 {
	
	public static void main(String[] args) {

		//OPCIÓN 1: los meses son un arraylist.
	    
			//Creamos el arraylist de cadenas con los meses y printamos.
			System.out.println("OPCIÓN 1: LOS MESES SON UN ARRAYLIST");
	
			List<String> months = Arrays.asList("ENE","FEB","MAR","ABR","MAY","JUN","JUL","AGO","SEP","OCT","NOV","DIC");
			
			//Printamos sin usar lambda:
	  	    System.out.println("Impresión System Out Print (sin lambda): ");
		    System.out.println(months);
		    
		    //Creamos la lambda e imprimimos.
	  	    System.out.println("Impresión Lambda: ");
		    months.forEach(l -> System.out.println(l));
		    
	    
	  //OPCIÓN 2: los meses son un array.
		
	  		//Creamos el array de cadenas con los meses y printamos.
	  		System.out.println("\nOPCIÓN 2: LOS MESES SON UN ARRAY");
	  		String[] meses = {"ENE","FEB","MAR","ABR","MAY","JUN","JUL","AGO","SEP","OCT","NOV","DIC"};
	  		
			//Printamos sin usar lambda:
	  	    System.out.println("Impresión System Out Print (sin lambda): ");
	  	    System.out.println(Arrays.toString(meses));
	  		
	  	    //Creamos la lambda e imprimimos con un thread.
	  	    System.out.println("Impresión Lambda + thread: ");
	  	    new Thread(() -> System.out.println(Arrays.toString(meses))).start();

	    
	}
}
