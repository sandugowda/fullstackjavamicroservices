package com.fullstack.oops;

public class Triangle extends Shape {

	public Triangle() {
		// TODO Auto-generated constructor stub
	}

	public Triangle(double width, double height) {
		super(width, height);
		
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calculateArea() {
		
		
		// TODO Auto-generated method stub
		return .5*getWidth()*getHeight();
	}

}
