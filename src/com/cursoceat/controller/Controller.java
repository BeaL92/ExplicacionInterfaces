package com.cursoceat.controller;

import com.cursoceat.model.Delfin;
import com.cursoceat.model.Gato;
import com.cursoceat.model.Perro;
import com.cursoceat.model.Tortuga;

public class Controller {
	public static void main(String[] args) {
		
		Delfin miDelfin=new Delfin("Fliper", 200, "Delfin rosa", 4);
		System.out.println(miDelfin.toString());
		Gato miGato=new Gato("Misifu", 8, "Egipcio", 6, "Negro");
		miGato.numPatas();
		miGato.timbre();
		miGato.voz();
		System.out.println(miGato.toString());
		Perro miPerro=new Perro("Estela", 7, "Caniche", "Marrón");
		miPerro.numPatas();
		miPerro.timbre();
		miPerro.voz();
		System.out.println(miPerro.toString());
		Tortuga miTortuga=new Tortuga();
		miTortuga.setNombre("Trancas");
		miTortuga.setEspecie("Marina");
		miTortuga.setPeso(25);
		miTortuga.setCaparazon("Blando");
		System.out.println(miTortuga.toString());
		
	}

}
