package com.design.patterns.creational.abstractfactory;

public abstract class UIFactory {
	
	public interface Window {
		public void draw();
	}
	
	public interface ScrollBar {
		public void draw();
	}
	
	public static UIFactory getUIFactory(String type) {
		
		if(type.equals("GNOME")) {
			
			return new GnomeUIFactory();
		} else if(type.equals("KDE")) {
			
			return new KDEUIFactory();
		}
		
		return null;
	}

	public abstract Window getWindow();
	public abstract ScrollBar getScrollBar();
}
