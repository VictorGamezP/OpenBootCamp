package com.openbotcamp;



public class FuncionesRecursiva {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        // Esto es un paso por valor
		// Se copia el valor y el tipo de dato.
		suma(1,2);
		
	}
	
	
		public static int  suma(int  a,int b) {
		int resultado=a+b;
		System.out.println("La suma es :" + resultado);
		return suma(a,resultado);
	}

}
