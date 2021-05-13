package view;

public class Calculadora {
	
	public static void main(String[] args) {
			
	ICalculadora suma = (a,b) -> {
		float resultado=a+b;
		System.out.print("\nEl resultado de la SUMA es: " + resultado);
	};
		
	ICalculadora resta = (a,b) -> {
		float resultado=a-b;
		System.out.print("\nEl resultado de la RESTA es: " + resultado);
	};
	
	ICalculadora multiplicacion = (a,b) -> {
		float resultado=a*b;
		System.out.print("\nEl resultado de la MULTIPLICACIÓN es: " + resultado);
	};
	
	ICalculadora division = (a,b) -> {
		float resultado=a/b;
		System.out.println("\nEl resultado de la DIVISIÓN es: " + resultado);
	};

	float n1 = 12;
	float n2 = 2;
	
	suma.calculo(n1, n2);
	resta.calculo(n1, n2);
	multiplicacion.calculo(n1, n2);
	division.calculo(n1, n2);
	
	
}

}