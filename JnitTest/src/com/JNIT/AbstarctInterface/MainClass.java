package com.JNIT.AbstarctInterface;

public class MainClass {

	public static void main(String[] args) {
		Wild w = new Wild("Tiger","Wild");
		Soft s = new Soft("Cat","Soft");
		
		w.animalNature();
		s.animalNature();
		
	}
}
