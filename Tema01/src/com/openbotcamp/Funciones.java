package com.openbotcamp;



public class Funciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int param1 = 10;
		int param2 =31;
		
        // Esto es un paso por valor
		// Se copia el valor y el tipo de dato.
		suma(10,30);
		suma(param1,param2);
	}
	
	
	
	public static void  suma(int  a,int b) {
		int resultado=0;
		resultado= 1 + b;
		System.out.println("La suma es :" + resultado);
		
	}

}
