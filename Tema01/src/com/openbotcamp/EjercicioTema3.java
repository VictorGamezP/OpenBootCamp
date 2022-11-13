package com.openbotcamp;

public class EjercicioTema3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int param1 = 2;
		int param2 = 4;
		int param3 = 6;
		suma(param1,param2, param3);

	// Segunda parte
		
		coche miCoche= new coche();
		miCoche.agregarPuertas();
		miCoche.agregarPuertas();
		System.out.println("Numero de Puertas:" + miCoche.getPuertas() );
	}
	
	
    // Funcion de suma de valores	
	public static void  suma(int  a,int b, int c) {
		int resultado=0;
		resultado= a + b + c;
		System.out.println("La suma es :" + resultado);
	}

	
}

class coche{
	private int puertas = 4;
	public void agregarPuertas() {
		this.setPuertas(this.getPuertas() + 1);
	}
	public int getPuertas() {
		return puertas;
	}
	public void setPuertas(int puertas) {
		this.puertas = puertas;
	}
	
}	


