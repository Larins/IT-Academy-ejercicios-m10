package Fase02;

//Creamos la interfaz funcional.
@FunctionalInterface
//Las interfaces funcionales solo pueden incluir 1 m�todo.
//La expresi�n @FunctionalInterface nos arrojar� un error cuando estemos incluyendo m�s de 1 m�todo.
public interface IPiValue {
	//Esta interfaz nos va a devolver un double.
	void getPiValue(double a);
}
