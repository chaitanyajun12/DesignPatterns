package com.design.patterns.behavioral.state;

public class TCPStateClose extends TCPState {

	private static TCPState instance;
	
	public static TCPState getState() {
		
		if(instance == null)
			instance = new TCPStateClose();
		
		return instance;
	}

	@Override
	public void open(TCPConnection conn) {
		
		// Performs three way handshake and then opens the connection
		changeState(conn, CONN_ESTABLISH_STATE);
		System.out.println("TCPStateClose :: open()");
	}

	@Override
	public void close(TCPConnection conn) {
		System.out.println("TCPStateClose :: close()");
	}

	@Override
	public void listen(TCPConnection conn) {
		
		changeState(conn, TCPState.INVALID_STATE);
		System.out.println("TCPStateClose :: listen()");
	}

	@Override
	public void send(TCPConnection conn) {
		
		changeState(conn, TCPState.INVALID_STATE);
		System.out.println("TCPStateClose :: send()");
	}

	@Override
	public String toString() {
		return "STATE : Close State";
	}
}
