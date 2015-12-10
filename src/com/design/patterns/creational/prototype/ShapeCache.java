package com.design.patterns.creational.prototype;

import java.util.HashMap;
import java.util.Map;

public class ShapeCache {
	
	private static Map<String, Shape> shapes = new HashMap<>();
	
	public static Shape getInstance(String type) throws CloneNotSupportedException {
		
		if(!(type.equals("Square") || type.equals("Circle")))
			return null;
		
		return shapes.get(type).clone();
	}
	
	public static void loadCache() {

		Square square = new Square();
		shapes.put(square.getName(), square);
		
		Circle circle = new Circle();
		shapes.put(circle.getName(), circle);
	}

}
