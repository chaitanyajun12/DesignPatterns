package com.design.patterns.creational.abstractfactory;

/*
 * Abstract Factory Design Pattern - Creational Design Pattern
 * 
 * This Design Pattern can be considered as Factory of factories. Basically, the base factory object abstracts out the creation of other factories.
 * 
 * In this example, UIFactory is the base factory, which creates the other GNOME and KDE factories depending on the type of UI requested by the Client
 * Depending on the UI factory requested in the client, the UI components corresponding to that factory will be invoked.
 */
public class Client {
	
	public static void main(String args[]) {
		
		UIFactory ui = UIFactory.getUIFactory("GNOME");
		
		ui.getWindow().draw();
		ui.getScrollBar().draw();
		
		ui = UIFactory.getUIFactory("KDE");
		
		ui.getWindow().draw();
		ui.getScrollBar().draw();
	}
}
