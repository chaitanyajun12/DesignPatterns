package com.design.patterns.creational.singleton;

public class Singleton {

	private int n;
	private static Singleton singleton;
	
	private Singleton() {
		n = 10;
	}
	
	public static Singleton getInstance() {
		
		if(singleton == null) {
			singleton = new Singleton();
		}
		
		return singleton;
	}
	
	public void incrementByOne() {
		n += 1;
	}
	
	public int getN() {
		return n;
	}
	
}
