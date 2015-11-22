package com.design.patterns.creational.factory;

/*
 * Factory Design Pattern
 * 
 * In this creation design pattern, depending on the shape type we pass in the ShapeFactory class,
 * that corresponding Shape object is returned.
 * 
 * Basically, the creation of the object is hidden from the client side.
 */
public class Client {
	
	public static void main(String args[]) {
		
		IShape shape = ShapeFactory.getShape("RECTANGLE");
		shape.draw();
		
		shape = ShapeFactory.getShape("SQUARE");
		shape.draw();
	}
}
