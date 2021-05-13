//EJERCICIO 06
//Has de fer la mateixa impressi� del punt anterior per� fent-ho mitjan�ant method reference. 

package Fase01;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Ejercicio06 {

	
	public static void main(String[] args) {
		
		
		//Creamos el arraylist de cadenas con los meses y printamos.
		//NOTA: Usaremos la primera opci�n del ejercicio anterior (los meses son un arraylist).
		List<String> months = Arrays.asList("ENE","FEB","MAR","ABR","MAY","JUN","JUL","AGO","SEP","OCT","NOV","DIC");
		
		//Printamos sin usar lambda ni method reference.
	    System.out.println("Impresi�n System Out Print: ");
	    System.out.println(months);
	    System.out.print("Impresi�n referenciando el method reference: \n");
	    
		//Creamos el method reference.
	    Consumer<? super String> imprimir;
        months.forEach(Ejercicio06::imprimir); 
	}
	
	//Printamos usando el method reference.

	public static void imprimir(String mes) {
    	System.out.print(mes + ", ");
	}
}
