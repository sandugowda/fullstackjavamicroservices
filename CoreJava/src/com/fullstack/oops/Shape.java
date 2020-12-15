package com.fullstack.oops;


public abstract class Shape /*extends Object*/ {
	
	
	private double width,height;
	
	public Shape() {
		
	}

	public Shape(double width, double height) {
		this.width = width;
		this.height = height;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	
	public abstract double calculateArea() ;
	
	
	
	


	
	
	
	
	
	
	

}
