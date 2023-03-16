package com.cursoceat.model;

public class Delfin extends Animal implements Sonido{
	private double longAletas;

	public Delfin(String nombre, double peso, String especie, double longAletas) {
		super(nombre, peso, especie);
		this.longAletas = longAletas;
	}

	public double getLongAletas() {
		return longAletas;
	}

	public void setLongAletas(double longAletas) {
		this.longAletas = longAletas;
	}

	@Override
	public String toString() {
		return super.toString()+ "\nDelfin [longAletas=" + longAletas + "]";
	}

	public void voz() {
		System.out.println("Eeeee eeeee");
		
	}

	public void timbre() {
		System.out.println("Agudo");
		
		
	}
	
	

}
