package com.design.patterns.creational.singleton;

/*
 * Singleton is a Creational Design Pattern.
 * 
 * So, if a class follows Singleton design pattern, it allows only a single object to be created.
 * Normal object cannot be created, since the constructor is private. 
 * 
 * In this example, the variable n is incremented. The getInstance() method returns the object if its already
 * present.
 * 
 */
public class Client {

	public static void main(String args[]) {
		
		for(int i = 0; i < 10; i++) {

			Singleton singleton = Singleton.getInstance();
			singleton.incrementByOne();
			System.out.println(singleton.getN());
		}
	}
}
