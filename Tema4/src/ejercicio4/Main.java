package ejercicio4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner lee = new Scanner(System.in);
		
		Operaciones calculadora = new Operaciones();
		
		System.out.println("Introduzca un numero: ");
		calculadora.n1= lee.nextInt();
		
		System.out.println("Introduzca un numero: ");
		calculadora.n2= lee.nextInt();
		
		System.out.println(calculadora.suma());
		
		System.out.println(calculadora.resta());
		System.out.println(calculadora.multiplicacion());
		System.out.println(calculadora.division());
	
		//cerramos el scanner
		lee.close();
	}

}
