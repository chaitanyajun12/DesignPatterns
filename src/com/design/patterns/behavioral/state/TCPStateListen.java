package com.design.patterns.behavioral.state;

public class TCPStateListen extends TCPState {

	private static TCPState instance;
	
	public static TCPState getState() {
		
		if(instance == null)
			instance = new TCPStateListen();
		
		return instance;
	}

	@Override
	public void open(TCPConnection conn) {
		System.out.println("TCPStateListen :: open()");
	}

	@Override
	public void close(TCPConnection conn) {
		changeState(conn, TCPState.IDLE_STATE);
		System.out.println("TCPStateListen :: close()");
	}

	@Override
	public void listen(TCPConnection conn) {
		System.out.println("TCPStateListen :: listen()");
	}

	@Override
	public void send(TCPConnection conn) {
		conn.send();
		System.out.println("TCPStateListen :: send()");
	}

	@Override
	public String toString() {
		return "STATE : Listen State";
	}
	
}
