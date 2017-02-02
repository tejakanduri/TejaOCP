package com.JNIT.AbstarctInterface;

public abstract class CatType implements CatFamily {
	
	private String typeOfCat;
	private String behaviour;
	
	public CatType(String typeOfCat, String behaviour) {
		super();
		this.typeOfCat = typeOfCat;
		this.behaviour = behaviour;
	}

	public String getTypeOfCat() {
		return typeOfCat;
	}

	public String getBehaviour() {
		return behaviour;
	}
	
	
	
	
	
	

}
