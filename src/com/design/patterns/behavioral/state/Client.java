package com.design.patterns.behavioral.state;

public class Client {

	/*
	 * State Design Pattern
	 * --------------------
	 * 
	 * The behavior of an object changes depending on its internal state.
	 * This example shows the typical TCP connection establishment using the State Design Pattern.
	 * 
	 * This example shows the TCP connection establishment.
	 *  
	 *  CLOSED --> CONN_ESTABLISH --> LISTENING --> SENDING --> CLOSED
	 *  
	 *  So, depending on the state within the TCP connection the corresponding method will be invoked.
	 *  Here, in this example, the behavior of TCPConnection is dependent on its TCPState.
	 *  
	 */	
	public static void main(String args[]) {
		
		TCPConnection conn = new TCPConnection();
		
		System.out.println(conn.getState().toString());
		System.out.println("-------------------------------------------");
		
		conn.open();
		
		System.out.println(conn.getState().toString());
		System.out.println("-------------------------------------------");
		
		conn.listen();
		
		System.out.println(conn.getState().toString());
		System.out.println("-------------------------------------------");
		
		conn.send();
		
		System.out.println(conn.getState().toString());
		System.out.println("-------------------------------------------");
		
		conn.close();
		
		System.out.println(conn.getState().toString());
	}	
}
