package ejercicio1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int num;
		
		Numeros mates = new Numeros();
		
		Scanner lee = new Scanner(System.in);
		
		System.out.println("Introduzca un numero: ");
		
		num = lee.nextInt();
		
		System.out.println("El numero es primo?: ");
		System.out.println(mates.esPrimo(num));
		
		System.out.println("Introduzca un numero: ");
		
		num = lee.nextInt();

		System.out.println("El numero es capicua?: ");
		System.out.println(mates.esCapicua(num));
	}

}
