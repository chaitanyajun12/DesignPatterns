package com.design.patterns.creational.prototype;

public class Circle extends Shape {

	public Circle() {
		setName("Circle");
	}
	
	@Override
	public void draw() {
		System.out.println("Circle :: draw()");
	}

}
