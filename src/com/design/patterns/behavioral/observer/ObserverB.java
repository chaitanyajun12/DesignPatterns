package com.design.patterns.behavioral.observer;

/*
 * Observer's onDataUpdate() is invoked on the data change in Subject.
 */
public class ObserverB implements IObserver {

	private Subject subject;
	
	public ObserverB(Subject subject) {
		this.subject = subject;
	}
	
	@Override
	public void onDataUpdate() {		
		System.out.println("ObserverB :: onDataUpdate : " + subject.getData());
	}
}
