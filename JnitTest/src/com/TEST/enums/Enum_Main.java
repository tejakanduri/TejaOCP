package com.TEST.enums;

public class Enum_Main {

	private Burgers burger;

	public void setBurger(Burgers burger) {
		this.burger = burger;
	}

	public Burgers getBurger() {
		return burger;
	}

	public static void main(String[] args) {

		Enum_Main enums = new Enum_Main();

		for (Burgers bug : Burgers.values()) {
			System.out.println(bug.name() + " has the price value $ " + bug.getPrice());

		}

	}

}
