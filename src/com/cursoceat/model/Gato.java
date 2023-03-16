package com.cursoceat.model;

public class Gato extends Animal implements Sonido,Patas {
	private int numeroBigotes;
	private String color;
	public Gato(String nombre, double peso, String especie, int numeroBigotes, String color) {
		super(nombre, peso, especie);
		this.numeroBigotes = numeroBigotes;
		this.color = color;
	}
	public int getNumeroBigotes() {
		return numeroBigotes;
	}
		public void setNumeroBigotes(int numeroBigotes) {
			this.numeroBigotes = numeroBigotes;
		}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	public void voz() {
		System.out.println("miauuuuuu miauuuuuuuu");
		
	}
	
	public void timbre() {
		System.out.println("agudo");
		
	}
	public void numPatas() {
		System.out.println("Tiene 4 patas");
		
	}
	@Override
	public String toString() {
		return super.toString()+ "\n Gato [numeroBigotes=" + numeroBigotes + ", color=" + color + "]";
	}
	
	

}
