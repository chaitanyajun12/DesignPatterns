package com.design.patterns.creational.builder;

/*
 * Builder Design Pattern - Creational Design Pattern
 * 
 * If there are more number of parameters to be passed for the creation of an 
 * object, this design pattern is of the best choice.
 * 
 * In this example, it shows the creation of a HttpURL, using the nested class
 * Builder. All sub-components of the URL are initialized using the methods inside 
 * Builder. The final call to the build() method will initialize the HttpURL object
 * and return it to the client.
 */
public class Client {

	public static void main(String args[]) {

		HttpURL url = new HttpURL.Builder()
						.scheme("https")
						.host("www.google.com")
						.build();
		
		System.out.print(url.scheme() + HttpURL.COLON + HttpURL.SEPERATOR + HttpURL.SEPERATOR);
		System.out.println(url.host());
		System.out.print("PORT : " + url.port());
	}
	
}
