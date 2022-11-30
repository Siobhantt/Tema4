package ejercicio4;
/*Crea una clase denominada Operaciones,
 *  la cual va a contener una función no estática por cada una de las operaciones básicas
 *  : suma, resta, multiplicación y división. 
 *  Es decir, 4 funciones. Las variables con las que se van a realizar estas operaciones son globales no estáticas
 *  . Es decir, estas funciones no recibirán ningún parámetro de entrada.
 *   Ten en cuenta las características de estas funciones y 
 * la existencia de las variables globales para realizar las pruebas desde el método main().*/
public class Operaciones {
	
	int n1, n2; 
	
	int suma () {
		int suma = n1 + n2;
	
		return suma;
	}
	
	int resta () {
		int resta = n1 - n2;
	
		return resta;
	}
	
	int multiplicacion () {
		int multiplicacion = n1 * n2;
	
		return multiplicacion;
	}
	
	int division () {
		int division = n1 / n2;
	
		return division;
	}
	
}
