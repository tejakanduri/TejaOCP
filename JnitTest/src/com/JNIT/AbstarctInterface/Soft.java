package com.JNIT.AbstarctInterface;

public class Soft extends CatType{

	public Soft(String typeOfCat, String behaviour) {
		super(typeOfCat, behaviour);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void animalNature() {
		System.out.println(super.getTypeOfCat() +    " is " + super.getBehaviour()  + " animal");
		
	}

}
