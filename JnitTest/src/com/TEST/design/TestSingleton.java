package com.TEST.design;

public class TestSingleton {

	private static TestSingleton objCreation;

	private TestSingleton() {}

	public static TestSingleton getInstance() {
	
		if (objCreation == null) {
			synchronized (TestSingleton.class) {
				if (objCreation == null) {
					objCreation = new TestSingleton();
				}
			}
		}
		return objCreation;
	}
	
	public void demoSingleMethod(){
		System.out.println("This is the singleton demo method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestSingleton ts = TestSingleton.getInstance();
		
		ts.demoSingleMethod();
		

	}

}
