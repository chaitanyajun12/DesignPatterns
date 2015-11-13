package com.design.patterns.behavioral.state;

public class TCPConnection {
	
	private TCPState state;

	public TCPConnection() {
		state = TCPState.IDLE_STATE;
	}

	public void open() {
		System.out.println("TCPConnection :: opening connection");
		getState().open(this);
	}
	
	public void close() {
		System.out.println("TCPConnection :: closing connection");
		getState().close(this);
	}
	
	public void listen() {
		System.out.println("TCPConnection :: listening...");
		getState().listen(this);
	}
	
	public void send() {
		System.out.println("TCPConnection :: Sending data...");
	}
	
	protected final void changeState(TCPState state) {
		this.state = state;
	}

	public TCPState getState() {
		return state;
	}
	
}
