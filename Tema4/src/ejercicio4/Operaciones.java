package ejercicio4;

public class Operaciones {
	//Establecemos las variables que vamos a utilizar
	int n1, n2; 
	
	
	//Para crear los metodos usaremos la funciones declaradas al prinipio de esta clase
	/*Estamos creando varias funciones no staticas para luego e el main crear un objeto y llamar la funcion que necesitemos*/
	int suma () {
		int suma = n1 + n2;//hacemos la operacion de suma 
	
		return suma;
	}
	
	int resta () {
		int resta = n1 - n2;//operacion de resta
	
		return resta;
	}
	
	int multiplicacion () {
		int multiplicacion = n1 * n2;//operacion de multiplicacion
	
		return multiplicacion;
	}
	
	int division () {
		
		int division = 0;
		//si que el segundo numero que seria el divisor es distinto a 0 entonces ejecutamos la division
		if(n2!=0) {
			division = n1 / n2;
		}
		else {//en caso contrario mostramos un error
			System.out.println("error");
		}
	return division;
	}
	
}
