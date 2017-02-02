package com.TEST.enums;

public enum Burgers {

	BACON_CHEESE_BURGER(5.50) {
		@Override
		public void printPrice() {

			System.out.println("The price of the Bacon Cheese Burger is " + this.getPrice());
		}
	},
	FLAMETHROWER_BRUGER(6.75) {
		@Override
		public void printPrice() {

			System.out.println("The price of the Bacon Cheese Burger is " + this.getPrice());
		}
	},
	GRILL_CHEESE_BURGER(4.25) {
		@Override
		public void printPrice() {

			System.out.println("The price of the Grill Cheese Burger is " + this.getPrice());
		}
	},
	CHICKEN_SANDWICH(5.00) {
		@Override
		public void printPrice() {
			System.out.println("The price of the Chicken Sandwich is " + this.getPrice());

		}
	},
	FISH_SANDWICH(4.35) {
		@Override
		public void printPrice() {
			System.out.println("The price of the Fish Sandwich is " + this.getPrice());

		}
	};

	private double price;

	private Burgers(double price) {
		this.price = price;
	}

	public double getPrice() {
		return price;
	}

	public abstract void printPrice();

}
