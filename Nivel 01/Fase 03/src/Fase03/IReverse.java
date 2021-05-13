package Fase03;

//Creamos la interfaz funcional.
@FunctionalInterface
//Las interfaces funcionales solo pueden incluir 1 método.
//La expresión @FunctionalInterface nos arrojará un error cuando estemos incluyendo más de 1 método.
public interface IReverse {
	//Esta interfaz nos va a devolver un String.
    String reverse(String a);
}

