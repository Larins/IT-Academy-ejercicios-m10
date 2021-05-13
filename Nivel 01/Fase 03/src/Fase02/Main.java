//Crea una Functional Interface que continga un m�tode abstracte getPiValue (), que retorna un valor double; en una altra classe, instancie la interf�cie i assigneu-li mitjan�ant una lambda el valor 3.1415. Invoca el m�tode getPiValue de la inst�ncia d'interf�cie i imprimeix el resultat. 

package Fase02;

public class Main {

	public static void main(String[] args) {

		//Creamos la lambda.
		IPiValue miPi=(a)->System.out.println("Mi n�mero pi es: " + a);
		
		//Referenciamos al m�todo de la interfaz para darle un valor.
		//Se printar� solo porque la lambda ya incluye el System Out Print.
		miPi.getPiValue(3.1415);
		
	}
}
