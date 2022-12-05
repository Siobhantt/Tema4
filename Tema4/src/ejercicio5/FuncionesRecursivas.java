package ejercicio5;

public class FuncionesRecursivas {

	public static int sumatorio(int numero) {

		//declaramos las variables que sera lo que se devolverá al final
		int result;

		//declaramos que si el numero es igual a 0, es resultado será 0
		if (numero == 0) {
			result = 0;
		} else {
			result = numero + sumatorio(numero - 1);
			//El resultado será igual al numero introducido + el numero introducido menos 1
		}//Y seguirá ejecutando hasta que llegue al caso base
		return result;
	}

	public static double potencia(double numero, int potencia) {
		//establecemos el resultado como double
		double result;
		//si a es = 0 entonces el resultado será 0
		if (numero == 0) {
			result = 0;//esto es porque siempre que el numero sea 0 da igual la potencia que tenga, seguirá siendo 0
		} else if (potencia == 0) {//si n es igual a 0 entonces el resultado es 1
			//esto es porque todo numero elevado a 0 da 1
			result = 1;
		} else {//establecemos la funcion recursiva donde a potencia devolverá el resultado de
			//numero por la funcion potencia
			result = numero * potencia(numero, potencia-1);
		}
		return result;
	}
	
	public static int fibonacci(int posicion) {
		//declaramos el resultado a 0
		int resultado=0;
		/*Como sabemos que la posicion 0 y 1 de fibonacci devuelve 1 lo establecemos en un if */
		if (posicion <=1) {
			resultado = 1; 
		}/*el resto de las posiciones será igual a la suma de la posicion menos 1 y posicion menos 2*/
		else {
			resultado = fibonacci(posicion-1) + fibonacci(posicion-2);
		}
		
		return resultado;
	}
}
