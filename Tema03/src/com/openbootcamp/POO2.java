package com.openbootcamp;

/*
 *   Privacidad, abstaccion, encapsulación
 *   
 *   Las propiedades privadas solo se ven en la clase
 *   y no podemos acceder a la propiedad desde la isstancia.
 *   y surje la encapsulacion.
 *   
 *   Declaramos las propiedades privadas y metodos getes t seters.
 */

public class POO2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehiculo vehiculo = new Vehiculo();
		
		vehiculo.setTipo("Coupe");
		System.out.println(vehiculo.getTipo());
		
		
		Vehiculo moto = new Vehiculo();
		moto.setTipo("Scotter");
		System.out.println(moto.getTipo());
		
		
			}
}


class Vehiculo{
	 private String tipo;
	 
	 public void setTipo(String tipo) {
		 this.tipo=tipo; 
	 }
	 
	 public String getTipo(){
		 return this.tipo; 
	 }
	 
	 
	 
	 
	 
	 
	 
	 
}
