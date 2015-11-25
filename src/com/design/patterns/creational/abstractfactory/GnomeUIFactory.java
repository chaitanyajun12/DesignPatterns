package com.design.patterns.creational.abstractfactory;

public class GnomeUIFactory extends UIFactory {

	class GnomeWindow implements Window {

		@Override
		public void draw() {
			System.out.println("GNOME Window :: draw()");
		}
	}
	
	class GnomeScrollBar implements ScrollBar {

		@Override
		public void draw() {
			System.out.println("GNOME ScrollBar :: draw()");			
		}
	}
	
	@Override
	public Window getWindow() {
		return new GnomeWindow();
	}

	@Override
	public ScrollBar getScrollBar() {
		return new GnomeScrollBar();
	}

}
