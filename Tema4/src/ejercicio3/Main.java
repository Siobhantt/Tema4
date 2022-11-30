package ejercicio3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int numUser, valorMax, valorMin;
		
		Scanner lee = new Scanner(System.in);
		
		System.out.println("Introduzca la cantidad de numeros aleatorios que quiere generar: ");
		
		numUser = lee.nextInt();
		
		
		NumerosAleatorios.numerosAleatorios(numUser);
		
		System.out.println("Introduzca la cantidad de numeros aleatorios que quiere generar y el valor maximo: ");
		
		numUser = lee.nextInt();
		valorMax = lee.nextInt();
		
		NumerosAleatorios.numerosAleatorios(numUser, valorMax);
	
		System.out.println("Introduzca la cantidad de numeros aleatorios que quiere generar y el valor maximo y el valor minimo: ");
	
		numUser = lee.nextInt();
		valorMax = lee.nextInt();
		valorMin = lee.nextInt();
		
		NumerosAleatorios.numerosAleatorios(numUser, valorMax, valorMin);
	
	//cerramos scanner
			lee.close();
		
	}

}
