package com.cursoceat.model;

public class Animal {
	
	static int id;
	 protected String nombre;
	 protected double peso;
	 protected String especie;
	 protected int idTemp;
	 
	 
	 
	 public Animal() {
		 id++;
		 idTemp=id;
	}



	public Animal(String nombre, double peso, String especie) {
		 super();
		 this.nombre = nombre;
		 this.peso = peso;
		 this.especie = especie;
		 id++;
		 idTemp=id;
		 
		 
	 
	 }





	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public double getPeso() {
		return peso;
	}


	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}



	@Override
	public String toString() {
		return "Animal [nombre=" + nombre + ", peso=" + peso + ", especie=" + especie + ", idTemp=" + idTemp + "]";
	}











	}

