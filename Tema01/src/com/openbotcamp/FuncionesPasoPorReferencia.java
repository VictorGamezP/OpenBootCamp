package com.openbotcamp;



public class FuncionesPasoPorReferencia {
    
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Potato miPotato = new Potato();
		miPotato.QuitarBrazo();
		miPotato.QuitarBrazo();
		miPotato.QuitarBrazo();

		System.out.println(" Cantidad de brazos:  " + miPotato.getBrazos());
	}
	
}


class Potato{
	private int brazos = 0;
	public void QuitarBrazo() {
		this.setBrazos(this.getBrazos() - 1);
	}
	public int getBrazos() {
		return brazos;
	}
	public void setBrazos(int brazos) {
		this.brazos = brazos;
	}
	
}	
