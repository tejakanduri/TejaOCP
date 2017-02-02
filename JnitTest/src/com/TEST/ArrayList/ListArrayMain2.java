package com.TEST.ArrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ListArrayMain2 {

	public static void main(String[] args) {
		
		List<Order> order = new ArrayList<>();
		
		order.add(new Order(101,"flash Drive",3));
		order.add(new Order(102,"Memory Drive",6.00));
		order.add(new Order(103,"Computer",315));
		order.add(new Order(104,"book",7));
		order.add(new Order(105,"hard disk",13));
		
		Collections.sort(order);
		Iterator itr = order.iterator();
		
		for (Order order2 : order) {
			System.out.println(  order2.getOrderId() + " " +  order2.getOrderName() + " " +  order2.getOrderPrice());
		}
		
		

	}

}
