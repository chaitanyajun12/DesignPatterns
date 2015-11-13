package com.design.patterns.behavioral.state;

public class TCPStateEstablished extends TCPState {

	private static TCPState instance;
	
	public static TCPState getState() {
		
		if(instance == null)
			instance = new TCPStateEstablished();
		
		return instance;
	}

	@Override
	public void open(TCPConnection conn) {
		changeState(conn, TCPState.CONN_ESTABLISH_STATE);
		System.out.println("TCPStateEstablished :: open()");
	}

	@Override
	public void close(TCPConnection conn) {
		changeState(conn, TCPState.IDLE_STATE);
		System.out.println("TCPStateEstablished :: close()");
	}

	@Override
	public void listen(TCPConnection conn) {
		changeState(conn, TCPState.LISTEN_STATE);
		System.out.println("TCPStateEstablished :: listen()");
	}

	@Override
	public void send(TCPConnection conn) {
		changeState(conn, TCPState.LISTEN_STATE);
		System.out.println("TCPStateEstablished :: send()");
		// Perform the sending of bytes through the connection
	}
	
	@Override
	public String toString() {
		return "STATE : Connection establishment State";
	}

}