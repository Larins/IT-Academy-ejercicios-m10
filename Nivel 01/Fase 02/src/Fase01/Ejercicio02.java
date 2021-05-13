//EJERCICIO 02
//Escriu un mètode que retorne una cadena separada per comes basada en una llista d’Integers. Cada element hauria d'anar precedit per la lletra "e" si el nombre és parell, i precedit de la lletra "o" si el nombre és imparell. Per exemple, si la llista d'entrada és (3,44), la sortida hauria de ser "o3, e44". Imprimeix el resultat. 

package Fase01;

import java.util.Arrays;

public class Ejercicio02 {
	
	public static void main(String[] args) {
	
	//Creamos el array de integers y printamos.
	
	int[] listaInt = {5, 10, 15, 20, 30, 35, 40, 45, 50};
    System.out.println("\nArray de integers, printado SIN lambda: ");
	System.out.println(Arrays.toString(listaInt));
    System.out.println("\nArray de integers, printado CON lambda: ");
    Arrays.stream(listaInt).forEach(num -> System.out.println(num));
	
	//Creamos el método para que indique si los números son pares o impares.
	//Para ello miraremos si es divisible entre 2.
	
    String[] listaEvenOdd = new String[listaInt.length];
    int k = 0;
    for(int i = 0; i < listaInt.length; i++){
        if((listaInt[i] % 2 == 0) == true){
        	listaEvenOdd[k] = ("e"+listaInt[i]);
        }
        else if ((listaInt[i] % 2 == 0) == false) {
        	listaEvenOdd[k] = ("o"+listaInt[i]);
        };
            k++;         
    }	
    //Printamos.
    System.out.println("\nArray que indica par o impar, printado SIN lambda: ");
    System.out.println(Arrays.toString(listaEvenOdd));
    System.out.println("\nArray que indica par o impar, printado CON lambda: ");
    Arrays.stream(listaEvenOdd).forEach(num -> System.out.println(num));


    
  }
}

