//EJERCICIO 05
//Has de fer el mateix que en el punt anterior, però retornant una llista que incloga els elements amb més de 5 lletres. Imprimeix el resultat. 


package view;

import java.util.Arrays;

public class Ejercicio04 {
	
	public static void main(String[] args) {
		
		//Creamos el array de cadenas y printamos.
		//Cambiamos un poco el array para que haya varios con 5 caracteres (con y sin la letra O).
		String[] cadenas = {"Iron Maiden", "Judas", "Black Sabbath", "Pink Floyd", "Ghost", "Tool", "Ozzy Osbourne"};
	    System.out.println("Todas las cadenas: ");
	    System.out.println(Arrays.toString(cadenas));
	    
	    //Creamos el loop y las variables necesarias para printar solo las que cumplen las condiciones.
	    //Condiciones: que empiecen por A y tengan solo 3 letras.
	    //Guardaremos los items coincidentes en un nuevo array.
		    String[] cadenas5ConOo = new String[cadenas.length];
		    int k = 0;
		    String expresion5o = "[A-Za-z]{1,5}";
		    for(int i = 0; i < cadenas.length; i++){
		        if(((cadenas[i].contains("o")) || (cadenas[i].contains("O"))) && (cadenas[i].matches(expresion5o)) == true){
		        	cadenas5ConOo[k] = (cadenas[i]);
		            k++;         
		        }
		    }	
		    //Printamos.
		    System.out.println("Nombres que empiezan con A mayúscula: ");
		    System.out.println(Arrays.toString(cadenas5ConOo));
		
	}


}
