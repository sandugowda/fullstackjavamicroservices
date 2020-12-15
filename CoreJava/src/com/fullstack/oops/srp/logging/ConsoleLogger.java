package com.fullstack.oops.srp.logging;

public class ConsoleLogger {

	public ConsoleLogger() {
		// TODO Auto-generated constructor stub
	}
	
	public void writeInfo(String msg) {
		System.out.println("Info "+msg);
	}

	public void writeError(String msg,Exception e) {
		System.err.println("Error: "+msg+";"+e);
	}
}
