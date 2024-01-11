package javaTask_C_day_10;

public class Circle {

	//	Create a class circle class with radius as data member. 
	//	Create two constructors (no argument, and two arguments) 
	//	and a method to calculate Circumference.
	
	private double radius;
	
	public Circle() {
	this.radius=10;
	
	}
	public Circle(double radius){
	this.radius = radius;
	
	} 
	public double calculateCircumference() {
	return (2*radius);
		
	}
public static void main(String[] args) {
	
	Circle cle = new Circle();
	Circle cl = new Circle(50);
	double CCofc1 = cle.calculateCircumference();
	double CCofc2 = cl.calculateCircumference();
	System.out.println("Circumference of circle1: " + CCofc1);
	System.out.println("Circumference of circle2: " + CCofc2);
	
}
		
		
	}
	

