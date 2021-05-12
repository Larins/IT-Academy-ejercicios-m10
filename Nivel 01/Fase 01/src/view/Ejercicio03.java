//EJERCICIO 03
//Tenint una llista de Strings, escriu un mètode que retorne una llista de totes les cadenes que continguen la lletra ‘o’ i imprimeix el resultat. 

package view;

import java.util.Arrays;

public class Ejercicio03 {
	
	public static void main(String[] args) {
		
		//Creamos el array de cadenas y printamos.
		String[] cadenas = {"Iron Maiden", "Judas Priest", "Black Sabbath", "Pink Floyd", "Tool", "Ozzy Osbourne"};
	    System.out.println("Todas las cadenas: ");
	    System.out.println(Arrays.toString(cadenas));
	    
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
		    System.out.println("Nombres que contengan la letra O: ");
		    System.out.println(Arrays.toString(cadenasConOo));
	}
}
