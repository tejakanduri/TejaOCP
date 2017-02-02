package com.TEST.ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class MainArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MainArrayList arraylis = new MainArrayList();
		List<String> animals = new ArrayList<>();

		animals.add("Tiger");
		animals.add("Dog");
		animals.add("Elephant");
		animals.add("Girafee");
		animals.add("Crocodile");
		
		System.out.println("This is using the for each loop");
		animals.forEach(t -> System.out.println(t));
		
		System.out.println("=================");
		Collections.sort(animals); 

		System.out.println("This is using the iterator after sorting the list");
		Iterator itr = animals.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
