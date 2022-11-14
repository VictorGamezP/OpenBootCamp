package com.openbootcamp;

public class BucleDoWhile {

	public static void main(String[] args) {
		int contador=10;
		while (contador  > 0) {
			System.out.println(contador);
		    /*	contador = contador -1;    Sin experiencia */	
			contador --;   
			/* contador -=5;   Codigo avanzado*/
		}
		
		/* Lo mejor es usar el While es  suficiente */
		
		contador=10;
		do {
			System.out.println(contador);
		    /*	contador = contador -1;    Sin experiencia */	
			contador --;
		}while (contador >2);
		
	}
}



