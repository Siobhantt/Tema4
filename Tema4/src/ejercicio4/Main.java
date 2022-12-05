package ejercicio4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//iniciamos el scanner
		Scanner lee = new Scanner(System.in);
		
		/*Creamos el objeto llamado calculadora*/
		Operaciones calculadora = new Operaciones();
		
		//Imprimimos la solicitud del primero numero
		System.out.print("Introduzca un numero: ");
		calculadora.n1= lee.nextInt();
		//imprimimos la solicitud del segundo numero
		System.out.print("Introduzca otro numero: ");
		calculadora.n2= lee.nextInt();
		//Para imprimir el resultado lo que se hace es llamar al objeto. y ahi nos dará la opcion de alguna de las funciones disponibles antes creadas
		System.out.println("El resultado de la suma de los dos numero introducidos es " + calculadora.suma());
		
		
		
		System.out.print("Introduzca un numero: ");
		calculadora.n1= lee.nextInt();
		
		System.out.print("Introduzca otro numero: ");
		calculadora.n2= lee.nextInt();
		System.out.println("El resultado de la resta de los dos numero introducidos es " +calculadora.resta());
		
		
		
		System.out.print("Introduzca un numero: ");
		calculadora.n1= lee.nextInt();
		
		System.out.print("Introduzca otro numero: ");
		calculadora.n2= lee.nextInt();
		System.out.println("El resultado de la multiplicacion de los dos numero introducidos es " +calculadora.multiplicacion());
		
		
		
		System.out.print("Introduzca un numero: ");
		calculadora.n1= lee.nextInt();
		
		System.out.print("Introduzca otro numero: ");
		calculadora.n2= lee.nextInt();
		System.out.println("El resultado de la division de los dos numero introducidos es " +calculadora.division());
	
		
		
		//cerramos el scanner
		lee.close();
	}

}
