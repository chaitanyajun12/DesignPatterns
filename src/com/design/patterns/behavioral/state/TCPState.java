package com.design.patterns.behavioral.state;

public abstract class TCPState {

	public abstract void open(TCPConnection conn);
	public abstract void close(TCPConnection conn);
	public abstract void listen(TCPConnection conn);
	public abstract void send(TCPConnection conn);
	
	protected void changeState(TCPConnection conn, TCPState state) {
		conn.changeState(state);
	}
	
	public static TCPState IDLE_STATE = TCPStateClose.getState();
	public static TCPState CONN_ESTABLISH_STATE = TCPStateEstablished.getState();
	public static TCPState LISTEN_STATE = TCPStateListen.getState();
	
	public static TCPState INVALID_STATE = null;
}
