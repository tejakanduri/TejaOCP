package com.TEST.ArrayList;


public class Order implements Comparable<Order> {
	
	private int orderId;
	private String orderName;
	private double orderPrice;
	
	public Order(int orderId, String orderName, double orderPrice) {
		super();
		this.orderId = orderId;
		this.orderName = orderName;
		this.orderPrice = orderPrice;
	}

	public int getOrderId() {
		return orderId;
	}

	public String getOrderName() {
		return orderName;
	}

	public double getOrderPrice() {
		return orderPrice;
	}
	
	public String ConvertPrice(){
		return Double.toString(this.orderPrice);
	}

	@Override
	public int compareTo(Order o) {
		return this.getOrderName().compareTo(o.getOrderName());
	}
	
	
	
	
	

}
