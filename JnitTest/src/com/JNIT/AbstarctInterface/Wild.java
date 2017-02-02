package com.JNIT.AbstarctInterface;

public class Wild extends CatType {

	public Wild(String typeOfCat, String behaviour) {
		super(typeOfCat, behaviour);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void animalNature() {
		System.out.println(super.getTypeOfCat() +    " is " + super.getBehaviour()  + " animal");
		
	}
	
}
