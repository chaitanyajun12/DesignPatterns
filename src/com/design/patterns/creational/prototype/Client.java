package com.design.patterns.creational.prototype;

/*
 * Prototype Design Pattern
 * 
 * This creational design pattern caches the prototype (instance) of the class
 * and returns the clone of the object.
 * 
 * The difference when compared to the factory pattern is it returns the object itself
 * directly, whereas prototype design pattern returns the clone of the instance/prototype.
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
