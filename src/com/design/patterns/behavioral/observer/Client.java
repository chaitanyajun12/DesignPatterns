package com.design.patterns.behavioral.observer;

/*
 * Behavioral Design Pattern : Observer Pattern
 * 
 * Publish-Subscribe
 * -----------------
 * Publisher of notifications : Subject
 * Subscribers : Observers registers with the Subject
 * 
 */
public class Client {
	
	public static void main(String args[]) {

		System.out.println("OBSERVER DESIGN PATTERN");
		Subject s = new Subject();
		
		ObserverA o1 = new ObserverA(s);
		ObserverB o2 = new ObserverB(s);

		// Registering with the subject
		s.register(o1);
		s.register(o2);
		
		// Notifications are sent to the observers
		s.setData(100);
		s.setData(200);
	}
}
