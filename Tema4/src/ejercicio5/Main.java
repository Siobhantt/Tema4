package ejercicio5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		double numeroPicao;
		int numero;
		
		Scanner lee = new Scanner(System.in);
		
	
		
		System.out.println("Por favor introduzca un numero: ");
		numero=lee.nextInt();
	
		//Imprimimos la funcion de sumatorio
		System.out.println("El sumatorio de todos los numeros de 1 hasta " + numero + " es " + FuncionesRecursivas.sumatorio(numero));

		System.out.println("Por favor introduzca un numero: ");
		numeroPicao = lee.nextDouble();
		
		System.out.println("Por favor introduzca otro numero: ");
		numero=lee.nextInt();
		
		//Imprimimos la funcion de potencia
		System.out.println("La potencia de " + numeroPicao + "elevado a " + numero + " es " + FuncionesRecursivas.potencia(numeroPicao, numero));
		
		
		System.out.println("Por favor introduzca otro numero: ");
		numero=lee.nextInt();
		//Imprimimos la funcion de fibonacci
		System.out.println("El fibonacci de " + numero + " es " + FuncionesRecursivas.fibonacci(numero));
	
		//cerramos scanner
		lee.close();
	}

}
