package ejercicio1;

public class Numeros {
	boolean esPrimo(int numero) {

		boolean primo = true;
		 
		for (int i = 2; i <numero; i++) {
            if(numero%i==0){
                primo=false;
                break;
            }
        }
        return primo; 
	}
		

	boolean esCapicua(int numero) {
	
	boolean result;
	int aux;
    
    int inverso=0;
    int cifra;
    
    aux=numero;
    while(aux!=0){
        cifra = aux % 10;
        aux/=10;
        inverso=(inverso*10)+cifra;
    }
    //comparar ambas variables para saber si el numero es capicua
    if(inverso==numero){
       result = true;
    }else {
        result = false;
    }
    return result;
	}

}
