package view;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		
		//Feu una matriu que contingui algunes cadenes de text y numeros. Ordeneu-lo per:  
		
		List<String> miMatriz = Arrays.asList("Zozobra", "100", "Alucinante", "1", "Mono de feria", "10000", "Mono de trabajo","100000000000000000000", "Escalifragilístico espialidoso");
	    String[] miMatrizArr = {"Zozobra", "100", "Alucinante", "1", "Mono de feria", "10000", "Mono de trabajo","100000000000000000000", "Escalifragilístico espialidoso"};
	    System.out.println("\nImprimimos la matriz tal cual:");
		miMatriz.forEach(l -> System.out.println(l));
		Arrays.stream(miMatrizArr).forEach(System.out::println);


		//longitud (de més curta a més llarga) 	
	    System.out.println("\nImprimimos la matriz por la longitud de sus elementos ASC:");
		miMatriz.sort((s1, s2) -> s1.length() - s2.length());
		miMatriz.forEach(l -> System.out.println(l));
		Arrays.stream(miMatrizArr).sorted((s1, s2) -> s1.length() - s2.length()).forEach(System.out::println);


		//longitud inversa (de  més llarga a més curta) 
		System.out.println("\nImprimimos la matriz por la longitud de sus elementos DESC:");
		miMatriz.sort((s1, s2) -> s2.length() - s1.length());
		miMatriz.forEach(l -> System.out.println(l));
		Arrays.stream(miMatrizArr).sorted((s1, s2) -> s2.length() - s1.length()).forEach(System.out::println);
	    
	    //Otra forma de imprimir la matriz por extensión de sus elementos.
		//Collections.sort(miMatriz, Comparator.comparing(String::length));
	    //System.out.println("\nImprimimos la matriz ordenada por la longitud de sus elementos:");
		//miMatriz.forEach(l -> System.out.println(l));

		//alfabèticament pel primer caràcter (Nota: charAt (0) retorna el codi numèric del primer caràcter) 
	    System.out.println("\nImprimimos la matriz por orden alfabético:");
	    miMatriz.sort((p1, p2) -> p1.compareTo(p2));
		miMatriz.forEach(l -> System.out.println(l));
		Arrays.stream(miMatrizArr).sorted((p1, p2) -> p1.compareTo(p2)).forEach(System.out::println);
		
		//Les cadenes que contenen "e" primer, tota la resta en segon lloc. De moment, poseu el codi directament a la lambda. 
		System.out.println("\nImprimimos la matriz poniendo los items con E al principio:");
	    String[] miMatrizArrConE = new String[miMatrizArr.length];
	    int k = 0;
	    for(int i = 0; i < miMatrizArr.length; i++){
	        if((miMatrizArr[i].toUpperCase().contains("E") ) == true){
	        	miMatrizArrConE[k] = "1-" + miMatrizArr[i];
	        } else {
	        	miMatrizArrConE[k] = "2-" + miMatrizArr[i];
	        };
	            k++;         
	    }	
	    Arrays.stream(miMatrizArrConE).sorted((p1, p2) -> p1.compareTo(p2)).forEach(num -> System.out.println(num));
		

		//Modifica tots els elements de la matriu per canviar els caracters “a” a “4” 
	    System.out.println("\nImprimimos la matriz sustituyendo los caracteres A por 4:");
	    String[] miMatrizArrA4 = new String[miMatrizArr.length];
	    int j = 0;
	    for(int i = 0; i < miMatrizArr.length; i++){
	        if((miMatrizArr[i].toUpperCase().contains("A") ) == true){
	        	miMatrizArrA4[j] = (miMatrizArr[i].replace("A", "4").replace("a", "4"));
	        } else {
	        	miMatrizArrA4[j] = (miMatrizArr[i]);
	        };
	            j++;         
	    }	
	    Arrays.stream(miMatrizArrA4).sorted((p1, p2) -> p1.compareTo(p2)).forEach(num -> System.out.println(num));

	    //Mostra només els elements que siguin 100% numerics. (tot i que estigui guardats com strings)  
	    System.out.println("\nImprimimos la matriz pero solamente los elementos totalmente numéricos:");
	    String[] miMatrizArrNum = new String[miMatrizArr.length];
	    int v = 0;
	    String alphabetical = "[/^[^a-z]+$]{1,1000}";
	    for(int i = 0; i < miMatrizArr.length; i++){
	        if((miMatrizArr[i].toLowerCase().matches(alphabetical) ) == true){
	        	miMatrizArrNum[v] = miMatrizArr[i];
	        } else {
	        	miMatrizArrNum[v] = "null";
	        };
	            v++;         
	    }	
	    Arrays.stream(miMatrizArrNum).sorted((p1, p2) -> p1.compareTo(p2)).forEach(num -> System.out.println(num));
	    
	}
}
