package com.fullstack.oops.main;

import com.fullstack.oops.Rectangle;
import com.fullstack.oops.Shape;
import com.fullstack.oops.Triangle;

public class TestShape {

	
	public static void display(Shape shape) {
		System.out.println("Area of  "+shape.getClass().getSimpleName()+" is "
	+shape.calculateArea());
		
	}
	
	public static void main(String[] args) {

		Shape rectangle = new Rectangle(23.4,34.5);
		
		System.out.println(rectangle.getClass().getName());
		
		Shape triangle = new Triangle(23.4,34.5);
		
		display(rectangle);
		display(triangle);
		
		String s1="abcd"; // heap memory 
		System.out.println(s1.hashCode());
		//String s2="wxyz";
		//String s3="efgh";
		s1=s1+"efgh"; // new address space
		System.out.println(s1.hashCode());
		
		

	}

}

// OOPS 

// &

// SOLID


// SingleResponsibility
// OpenClosedPrinciple
// Liskov SubstitutionPrinciple)
// Interface Segregation Principle
// Dependency Inversion Principle






// java.lang (Default Package)
// java.lang.reflect (Reflection)

// java.io.* (InputStream & OutputStreams)
// java.nio.* (Nonblocking IO))
// java.sql.* (JDBC)
// java.util.* (Collections API used for datastructures)





// Data Types

// primitives & reference;


// Stack Memory
// byte
// short
// int
// long
// float
// double
// boolean
// char

// Heap Memory
// Reference Types

