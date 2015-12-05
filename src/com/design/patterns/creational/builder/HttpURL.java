package com.design.patterns.creational.builder;

import java.io.File;

public class HttpURL {

	public static final String SEPERATOR = File.separator;
	public static final char COLON = ':';
	
	private final String scheme;
	private final String host;
	private final int port;
	
	public static class Builder {
		
		private String scheme;
		private String host;
		private int port;
		
		public Builder scheme(String scheme) {
			
			if(!(scheme.equals("http") || scheme.equals("https")))
				return null;
			
			if(scheme.equals("http")) {
				port(80);
			} else if(scheme.equals("https")) {
				port(443);
			}
			
			this.scheme = scheme;
			return this;
		}
		
		public Builder host(String host) {
			this.host = host;
			return this;
		}
		
		public Builder port(int port) {
			
			this.port = port;
			return this;
		}
		
		public HttpURL build() {
			return new HttpURL(this);
		}
	}
	
	public String scheme() {
		return scheme;
	}
	
	public String host() {
		return host;
	}
	
	public int port() {
		return port;
	}
	
	private HttpURL(Builder builder) {
		
		this.scheme = builder.scheme;
		this.host = builder.host;
		this.port = builder.port;
		
	}
}
