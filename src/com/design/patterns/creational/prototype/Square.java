package com.design.patterns.creational.prototype;

public class Square extends Shape {

	public Square() {
		setName("Square");
	}
	
	@Override
	public void draw() {
		System.out.println("Square :: draw()");
	}
}
