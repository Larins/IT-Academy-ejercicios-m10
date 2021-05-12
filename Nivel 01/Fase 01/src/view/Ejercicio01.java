//EJERCICIO 01
////Tenint una llista de cadenes de noms propis, escriu un mètode que retorne una llista de totes les cadenes que comencen amb la lletra 'a' (majúscula) i tenen exactament 3 lletres. Imprimeix el resultat. 

package view;

import java.util.*;

public class Ejercicio01 {
	
	public static void main(String[] args) {

	//Creamos el array de nombres y printamos.
	String[] nombres = {"Ana", "Juan", "Ari", "Héctor", "Alicia", "Eva"};
    System.out.println("Todos los nombres: ");
    System.out.println(Arrays.toString(nombres));
    
    //Creamos el loop y las variables necesarias para printar solo las que cumplen las condiciones.
    //Condiciones: que empiecen por A y tengan solo 3 letras.
    //Guardaremos los items coincidentes en un nuevo array.
	    String[] nombresConA = new String[nombres.length];
	    int k = 0;
	    String expressionA = "[A]{1}[A-Za-z]{2,3}";
	    for(int i = 0; i < nombres.length; i++){
	        if((nombres[i].matches(expressionA)) == true){
	        	nombresConA[k] = (nombres[i]);
	            k++;         
	        }
	    }	
	    //Printamos.
	    System.out.println("Nombres que empiezan con A mayúscula: ");
	    System.out.println(Arrays.toString(nombresConA));
	}
}
