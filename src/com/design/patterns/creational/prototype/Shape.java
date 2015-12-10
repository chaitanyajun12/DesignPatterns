package com.design.patterns.creational.prototype;

public abstract class Shape implements Cloneable {

	private String name;
	
	public abstract void draw();
	
	@Override
	protected Shape clone() throws CloneNotSupportedException {
		return (Shape) super.clone();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
