package com.openbootcamp;

public class BucleFor {

	public static void main(String[] args) {
		/* Un buble for tiene 2 partes 
		 * Primer: parametro: inicializacion
		 * Segundo: Comparacion
		 * Tercero: Accion
		 */
		
		for(int contador=1; contador <=10; contador ++) {
			System.out.println(" Contador: " + contador);
		}
		
		
		  
		/* Ejemplo de bucle for con Array*/
		System.out.println("Ejemplo de bucle for con Array");
		
		/*int valores [] = new int[5];*/
		int valores[] = {20,30,40,50,60,70,80,90};
		
		
		for (int i=0; i< valores.length; i++ ) {
		  System.out.println("Valores de Array : " +  valores[i]);	
		}
		
		
		
		
	}
}




