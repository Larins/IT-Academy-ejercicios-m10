////Crea una Functional Interface que continga un mètode abstracte reverse (), que retorne un valor String; en una altra classe, injecta a la interfície creada mitjançant una lambda el cos del mètode, de manera que torne la mateixa cadena que rep com a paràmetre però a l'inrevés. Invoca la instància de la interfície passant-li una cadena i comprovant el resultat. 
	package Fase03;
	
	public class Main {
	    public static void main(String[] args) {
	    	
	    	//Creamos la lambda con el loop que va a recorrer el string hacia atrás.
	    	IReverse IReverse = (b) -> {
	            String result = "";
	            for (int i = b.length() - 1; i >= 0; i--)
	                result += b.charAt(i);
	            return result;
	        };
	        
	        //Creamos el string que vamos a revertir.
	        String cadena = "STRESSED";
        
        //Printamos:
        System.out.println("¿Sabías que " + cadena + " (estresad@) al revés es " + IReverse.reverse(cadena) + " (postres)? ;) \n");
		
        
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