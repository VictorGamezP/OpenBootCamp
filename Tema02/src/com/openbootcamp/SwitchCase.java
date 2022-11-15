package com.openbootcamp;

public class SwitchCase {

	public static void main(String[] args) {
		/* Un buble for tiene 2 partes 
		 * Primer: parametro: inicializacion
		 * Segundo: Comparacion
		 * Tercero: Accion
		 */
		
		var estacion = "VERANO";
		
		switch(estacion) {
		case "VERANO":
			System.out.println(" es verano: ");
			break;
			
		case "INVIERNO":
			System.out.println(" es INVIERNO: ");
			break;
		default:
			System.out.println(" es default  ");
		}
	}
}




