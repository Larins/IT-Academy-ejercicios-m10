//Crea una Functional Interface que continga un mètode abstracte getPiValue (), que retorna un valor double; en una altra classe, instancie la interfície i assigneu-li mitjançant una lambda el valor 3.1415. Invoca el mètode getPiValue de la instància d'interfície i imprimeix el resultat. 

package Fase02;

public class Main {

	public static void main(String[] args) {

		//Creamos la lambda.
		IPiValue miPi=(a)->System.out.println("Mi número pi es: " + a);
		
		//Referenciamos al método de la interfaz para darle un valor.
		//Se printará solo porque la lambda ya incluye el System Out Print.
		miPi.getPiValue(3.1415);
		
	}
}
