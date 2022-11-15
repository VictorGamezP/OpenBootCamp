package com.openbootcamp;

public class EjercicioTema2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        comparacion();
        bucle();
        bucleDoWhile();
        bucleFor();
        condicionSwitch();
	}


	private static void comparacion(){
		int numero=-5;
		
		if (numero>0) {
			System.out.println(" El numero " + numero + " es positivo"); 
		}
		else if (numero <0) {
			System.out.println(" El numero " + numero + " es negativo");
		}
		else {
			System.out.println(" El numero " + numero + " es cero");
		}
	}

	private static void bucle() {
		int numero = 0;
		
		while (numero <3)   {
			
			System.out.println("Numero de Bucle: " + numero);
			numero++;
		}
	}
		
	private static void bucleDoWhile() {
			int numero = 2;
			
			do {
				
				System.out.println("Numero de Bucle Do While: " + numero);
				numero++;
			}while (numero <3);  
		
	}	
		

	private static void bucleFor() {
		for(int numero = 0;numero<3 ;numero++ ) {
			System.out.println("Numero de Bucle For: " + numero);			
		}
	}	


	private static void  condicionSwitch() {
		String estacion ="PRIMAVERA";
		
		switch(estacion){
		case "PRIMAVERA":
			 System.out.println(" es Primavera ");
				break;	 
		case "VERANO":
			 System.out.println(" es Verano ");
				break;
		case "OTOÑO":
			 System.out.println(" es Otoño ");
				break;
		case "INVIERNO":
			 System.out.println(" Estacion incorrecta ");
				break;
		}
		
	}	

	
		
}







