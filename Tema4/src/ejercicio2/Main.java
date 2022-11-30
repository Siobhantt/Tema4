package ejercicio2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner lee = new Scanner(System.in);
		
		System.out.println("Por favor introduzca el radio: ");
		
		Esfera.radio = lee.nextDouble();
	
		System.out.println("La superficie de la esfera, que tiene radio de " + Esfera.radio + " es : " + Esfera.superficie());
		
		System.out.println("El volumen de la esfera, que tiene radio de " + Esfera.radio + " es : " + Esfera.volumen());
		
		//cerramos scanner
		
		lee.close();
	}

}
