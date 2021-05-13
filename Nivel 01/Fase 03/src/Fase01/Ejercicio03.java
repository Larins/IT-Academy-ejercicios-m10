//EJERCICIO 03
//Tenint una llista de Strings, escriu un mètode que retorne una llista de totes les cadenes que continguen la lletra ‘o’ i imprimeix el resultat. 

package Fase01;

import java.util.Arrays;

public class Ejercicio03 {
	
	public static void main(String[] args) {
		
		//Creamos el array de cadenas y printamos.
		String[] cadenas = {"Iron Maiden", "Judas", "Black Sabbath", "Pink Floyd", "Ghost", "Tool", "Ozzy Osbourne"};
	    System.out.println("\nTodas las cadenas, printadas SIN lambda: ");
	    System.out.println(Arrays.toString(cadenas));
	    System.out.println("\nTodas las cadenas, printadas CON lambda: ");
	    Arrays.stream(cadenas).forEach(num -> System.out.println(num));
	    
	    //Creamos el loop y las variables necesarias para printar solo las que cumplen las condiciones.
	    //Condiciones: que contengan la letra "o".
	    //Guardaremos los items coincidentes en un nuevo array.
		    String[] cadenasConOo = new String[cadenas.length];
		    int k = 0;
		    for(int i = 0; i < cadenas.length; i++){
		        if((cadenas[i].contains("o") || (cadenas[i].contains("O")) == true)){
		        	cadenasConOo[k] = (cadenas[i]);
		            k++;         
		        }
		    }	
		    //Printamos.
		    System.out.println("\nSOLO nombres que cumplan condiciones, printadas SIN lambda: ");
		    System.out.println(Arrays.toString(cadenasConOo));
		    System.out.println("\nSOLO nombres que cumplan condiciones, printadas CON lambda: ");
		    Arrays.stream(cadenasConOo).forEach(num -> System.out.println(num));

	}
}
