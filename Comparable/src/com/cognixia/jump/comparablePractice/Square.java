// Jakob Evans
// 9/15/21
// Method Overriding


package com.cognixia.jump.comparablePractice;

public class Square extends Shape{
	
	private double side; 

	
	public Square() {
		super("square", "noColor");
		this.side = 0;
	}
	
	public Square( String color, double side) {
		super("square", color);
		this.side = side;
	}
	
	@Override
	public Double Area() {
		return side * side;
	}
	@Override
	public void printShapeData() {
		System.out.println("\nType is : " + super.getType() + ", Color is : " + super.getColor() + ", Side length is: " + side);
		
	}
	
	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}

}
