package ejercicio3;

public class NumerosAleatorios {

public static void numerosAleatorios(int n) {
		
		int numeroX=0;
		
		for (int i = 1; i<=n; i++) {
			
			numeroX =(int) (Math.random()*(100-1)+1);
			System.out.println(numeroX); 
		}
	}
	public static void numerosAleatorios(int n1, int n2) {
		
		int numeroX =0;
		for(int i = 1; i <= n1; i++ ) {
			
			numeroX = (int)( Math.random()*(n2-1)+1);
			
			System.out.println(numeroX);
		}
		
		
	}
	
	public static void numerosAleatorios(int n1, int n2, int n3) {
		
		int numeroX=0;
		
		for(int i=1; i<=n1; i++) {
			
			numeroX = (int)(Math.random()*(n3-n2)+n2);
			
			System.out.println(numeroX);
		}

	}
}
