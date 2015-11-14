package com.design.patterns.behavioral.observer;

/*
 * Observer's onDataUpdate() is invoked on the data change in Subject.
 */
public class ObserverA implements IObserver {

	private Subject subject;
	
	public ObserverA(Subject subject) {
		this.subject = subject;
	}
	
	@Override
	public void onDataUpdate() {
		System.out.println("ObserverA :: onDataUpdate : " + subject.getData());
	}
}
