//EJERCICIO 01
////Tenint una llista de cadenes de noms propis, escriu un mètode que retorne una llista de totes les cadenes que comencen amb la lletra 'a' (majúscula) i tenen exactament 3 lletres. Imprimeix el resultat. 

package Fase01;

import java.util.*;

public class Ejercicio01 {
	
	public static void main(String[] args) {
		

		//Creamos el array de nombres y lo printamos completo.
			String[] nombres = {"Ana", "Juan", "Ari", "Héctor", "Alicia", "Eva"};
		    System.out.println("\nTodos los nombres, printados SIN lambda: ");
		    System.out.println(Arrays.toString(nombres));
		    System.out.println("\nTodos los nombres, printados CON lambda: ");
		    Arrays.stream(nombres).forEach(num -> System.out.println(num));
		    
		    	/*CASO DE SER UN ARRAY LIST EN LUGAR DE UN ARRAY LA SINTAXIS SERIA ESTA:
		    	 	//Declarar y poblar el arraylist:
		    	 		List<String> names = Arrays.asList("Ana", "Juan", "Ari", "Héctor", "Alicia", "Eva");

		    	 	//Printar SIN lambda:
						for (String s : names) {
							System.out.println(s);
						}
						
		    	 	//Printar CON lambda:
		    			//names.forEach(s -> System.out.println(s));
		    			 
		    			 */

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
		    System.out.println("\nSOLO nombres que cumplan condiciones, printados SIN lambda: ");
		    System.out.println(Arrays.toString(nombresConA));
		    System.out.println("\nSOLO nombres que cumplan condiciones, printados CON lambda: ");
		    Arrays.stream(nombresConA).forEach(num -> System.out.println(num));
		    

}}
