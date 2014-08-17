package com.truelogic.java.clase;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App {
	
    public static void main( String[] args ) {
    	List<Animal> animales = new ArrayList<Animal>();

    	int bananas = 5;

    	Pajaro pepita = new Pajaro("Pepita");
    	Perro feli = new Perro("Feli");

        animales.add(pepita);
        animales.add(feli);
        
        for (Animal animal : animales) {
        	animal.come(bananas);
        	System.out.println("la energia de " + animal.getNombre() + " es: " + animal.getEnergia());
        }
        
    }
    
}
