package ejercicio3;

public class NumerosAleatorios {

public static void numerosAleatorios(int n) {
		
	//Declaramos la variable donde guardaremos el numero random que queremos ejecutar
		int numeroX=0;
		
		//iniciamos un for donde el inicio será 1 hasta el valor del parametro de entrada
		//incrementaremos 1
		
		for (int i = 1; i<=n; i++) {
			/*numeroX es el numero aleatorio*/
			numeroX =(int) (Math.random()*(100-1)+1);
			System.out.println(numeroX); //y se va a imprimir n veces , siendo n el numero introducido por usuario
		}
	}
	public static void numerosAleatorios(int n1, int n2) {
		/*En este caso es igual al anterior pero el tope de los numeros aleatorios sera el segundo numero introducido*/
		int numeroX =0;
		for(int i = 1; i <= n1; i++ ) {
			
			numeroX = (int)( Math.random()*(n2-1)+1);//por eso aqui en vez de 100 se ha escrito el segundo parametro
			
			System.out.println(numeroX);
		}
		
		
	}
	
	public static void numerosAleatorios(int n1, int n2, int n3) {//en este caso n3 es el valor minimo que tendrá el numero aleatorio
		
		int numeroX=0;
		
		for(int i=1; i<=n1; i++) {// n es la cantidad de numeros aleatorios que se van a generar.
			
			numeroX = (int)(Math.random()*(n3-n2)+n2);//Por eso en este caso n3 correspnde al minimo, n2 al maximo
			
			System.out.println(numeroX);
		}

	}
}
