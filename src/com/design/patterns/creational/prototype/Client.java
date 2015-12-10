package com.design.patterns.creational.prototype;

/*
 * Prototype Design Pattern
 * 
 * This creational design pattern caches the prototype (instance) of the class
 * and returns the clone of the object.
 */
public class Client {
	
	public static void main(String args[]) {
	
		ShapeCache.loadCache();
		
		try {
		
			Shape shape = ShapeCache.getInstance("Square");
			shape.draw();
			
			shape = ShapeCache.getInstance("Circle");
			shape.draw();
		
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
	}
}
