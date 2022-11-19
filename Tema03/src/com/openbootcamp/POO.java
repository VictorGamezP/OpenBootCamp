package com.openbootcamp;

public class POO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		Coche coche = new Coche();
		System.out.println(coche.numeroDePuertas);
		System.out.println(coche.velocidadMaxima);
		
				
		
		System.out.println(coche.velocidadActual);
		coche.acelerar();
		System.out.println(coche.velocidadActual);
		coche.desacelerar();
		System.out.println(coche.velocidadActual);
		
		System.out.println(" Coche 2");
		
		Coche coche2 = new Coche(10,190);
		System.out.println(coche2.numeroDePuertas);
		System.out.println(coche2.velocidadMaxima);
		
	}
}


// Esta es un objeto
class Coche{
	int numeroDePuertas;
	int velocidadMaxima;
	double velocidadActual;

	//Contrsuctores se ejecuta cuando se instancia la clase
	public Coche() {
		numeroDePuertas=5;
		velocidadMaxima=120;
	}
	
    // Sobrecarga 2 contrucrtores con distintos parametros	
	public Coche(int numeroDePuertas, int velocidadMaxima) {
		this.numeroDePuertas=numeroDePuertas;
		this.velocidadMaxima=velocidadMaxima;
	}
	

	
	
	
	//Métodos
	
	public void acelerar() {
		velocidadActual +=15;
	}
	public void desacelerar() {
		velocidadActual -=15;
	}
}
