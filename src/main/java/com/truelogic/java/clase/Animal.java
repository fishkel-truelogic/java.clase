package com.truelogic.java.clase;

public abstract class Animal {

	private int energia;
	private String nombre;

	public Animal(String nombre) {
		this.nombre = nombre;
	}

	public int getEnergia() {
		return energia;
	}

	public void setEnergia(int energia) {
		this.energia = energia;
	}
	
	public void come(int bananas) {
		setEnergia(bananas * 6);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	
	
}
