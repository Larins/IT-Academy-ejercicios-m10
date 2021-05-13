////Crea una Functional Interface que continga un m�tode abstracte reverse (), que retorne un valor String; en una altra classe, injecta a la interf�cie creada mitjan�ant una lambda el cos del m�tode, de manera que torne la mateixa cadena que rep com a par�metre per� a l'inrev�s. Invoca la inst�ncia de la interf�cie passant-li una cadena i comprovant el resultat. 
	package Fase03;
	
	public class Main {
	    public static void main(String[] args) {
	    	
	    	//Creamos la lambda con el loop que va a recorrer el string hacia atr�s.
	    	IReverse IReverse = (b) -> {
	            String result = "";
	            for (int i = b.length() - 1; i >= 0; i--)
	                result += b.charAt(i);
	            return result;
	        };
	        
	        //Creamos el string que vamos a revertir.
	        String cadena = "STRESSED";
        
        //Printamos:
        System.out.println("�Sab�as que " + cadena + " (estresad@) al rev�s es " + IReverse.reverse(cadena) + " (postres)? ;) \n");
		
        
        //Dibujo ASCII de un postre.
        System.out.println("        .-\"`'\"-.\r\n"
				+ "       /        \\\r\n"
				+ "       |        |\r\n"
				+ "       /'---'--`\\\r\n"
				+ "      |          |\r\n"
				+ "      \\.--.---.-./\r\n"
				+ "      (_.--._.-._)\r\n"
				+ "        \\=-=-=-/\r\n"
				+ "         \\=-=-/\r\n"
				+ "          \\=-/\r\n"
				+ "           \\/\r\n"
				+ "");

        
    }
}