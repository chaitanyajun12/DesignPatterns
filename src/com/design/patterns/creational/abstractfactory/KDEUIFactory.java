package com.design.patterns.creational.abstractfactory;

public class KDEUIFactory extends UIFactory {

	class KDEWindow implements Window {

		@Override
		public void draw() {
			System.out.println("KDE Window :: draw()");
		}
	}
	
	class KDEScrollBar implements ScrollBar {

		@Override
		public void draw() {
			System.out.println("KDE ScrollBar :: draw()");			
		}
	}
	
	@Override
	public Window getWindow() {
		return new KDEWindow();
	}

	@Override
	public ScrollBar getScrollBar() {
		return new KDEScrollBar();
	}

}
