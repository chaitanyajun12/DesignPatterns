package com.design.patterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {
		
	private int data;
	private List<Observer> observers;
	
	public Subject() {
		observers = new ArrayList<>();
	}
	
	public void register(Observer observer) {
		
		if(!observers.contains(observer))
			observers.add(observer);			
	}
	
	public void unregister(Observer observer) {
		
		if(observers.contains(observer))
			observers.remove(observer);
	}

	public void notifyObservers() {
		
		for(Observer observer : observers) {
			observer.onDataUpdate();
		}
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
		notifyObservers();
	}
}
