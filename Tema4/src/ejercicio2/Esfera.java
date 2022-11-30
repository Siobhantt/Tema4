package ejercicio2;

public class Esfera {

	static double radio;
	
	public static double superficie(){
	/*En este ejercicio Lydia me ha recordado que puedo meter formulas en el return 
	 *  asi no tengo que declararme una variable lo cual hace el codigo m uchisimo mas corto*/
		return 4*Math.PI * Math.pow(radio, 2);
	}
	
	public static double volumen() {
		
		return (4* Math.PI/3)*Math.pow(radio, 3);
	}
}
