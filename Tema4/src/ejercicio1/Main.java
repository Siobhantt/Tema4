package ejercicio1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//declaramos la variable num
		int num;
		
		//creamos el objeto mates, puesto que la funcion no es estatica.
		Numeros mates = new Numeros();
		//iniciamos el scanner
		Scanner lee = new Scanner(System.in);
		//imprimimos las solicitudes y leemos los numeros
		System.out.println("Introduzca un numero: ");
		
		num = lee.nextInt();
		
		
		System.out.println("El numero es primo?: ");
		//Imprimimos el objeto mates con la funcion esPrimo para varificar si el numero lo es
		System.out.println(mates.esPrimo(num));
		
		System.out.println("Introduzca un numero: ");
		
		num = lee.nextInt();

		System.out.println("El numero es capicua?: ");
		//hacemos la verificacion de si el numero es capicua con el objeto y la funcion.
		System.out.println(mates.esCapicua(num));
	
	lee.close();
	}

}
