package com.design.patterns.creational.factory;

public class ShapeFactory {

	public static IShape getShape(String type) {

		IShape shape = null;
		
		if(type.equals("RECTANGLE")) {

			shape = new Rectangle();
		} else if(type.equals("SQUARE")) {

			shape = new Square();
		}
		
		return shape;
	}
	
}
