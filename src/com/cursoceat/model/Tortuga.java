package com.cursoceat.model;

public class Tortuga extends Animal implements Patas {
	private String caparazon;

	public Tortuga(String caparazon) {
		super();
		this.caparazon = caparazon;
	}
	

	public Tortuga() {
		super();
	}


	public String getCaparazon() {
		return caparazon;
	}

	public void setCaparazon(String caparazon) {
		this.caparazon = caparazon;
	}

	@Override
	public void numPatas() {
		System.out.println("Tiene 4 patas");
		
	}

	@Override
	public String toString() {
		return super.toString()+ "\nTortuga [caparazon=" + caparazon + "]";
	}
	
	

}
