package com.cursoceat.model;



public class Perro extends Animal implements Sonido, Patas{
	private String color;
	
	
	
	

	public Perro(String nombre, double peso, String especie, String color) {
		super(nombre, peso, especie);
		this.color = color;
	}
	
	public String getColor() {
		return color;
	}
	
	
	public void setColor(String color) {
		this.color = color;
	}


	

	public void numPatas() {
		System.out.println("Tiene 4 patas");
		
		
		
	}
	
	public void voz() {
	System.out.println("Guaaauuu Guaaauuu");
		
	}


	public void timbre() {
	System.out.println("Grave");
		
	}

	@Override
	public String toString() {
		return super.toString()+"\n Perro [color=" + color + "]";
	}



}
