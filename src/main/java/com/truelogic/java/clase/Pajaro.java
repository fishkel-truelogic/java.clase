package com.truelogic.java.clase;

public class Pajaro extends Animal {

	public void come(int bananas) {
		setEnergia(bananas * 13);
		
	}
	
	public Pajaro(String nombre) {
		super(nombre);
	}

}
