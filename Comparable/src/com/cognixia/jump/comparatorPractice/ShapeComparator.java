// Jakob Evans
// 9/15/21
// Method Overriding

package com.cognixia.jump.comparatorPractice;

import java.util.Comparator;

public class ShapeComparator implements Comparator<ShapeComparator> {
	
	public Double Area() {
		System.out.println("I am in the parents area function (ShapeComparator class)");
		return 0.0;
	}
	
	private String color;
	private String type;
	
	@Override
	public int compare(ShapeComparator o1, ShapeComparator o2) {
		// TODO Auto-generated method stub
		if(o1.Area() == o2.Area())
			return 0;
		else if(o1.Area() > o2.Area()) {
			return 1;
		}
		else {
			return -1;
		}
		
		
	}
	
	
	
	public ShapeComparator() {
		this.color = "noColor";
		this.type = "parentShapeComparator";
	}
	
	public ShapeComparator( String type, String color) { 
		this.setType(type); 

		this.setColor(color); 
	}


	
	public void printShapeComparatorData() {
		System.out.println("\nType is : " + type + ", Color is : " + color);

		
	}



	public String getColor() {
		return color;
	}



	public void setColor(String color) {
		this.color = color;
	}



	public String getType() {
		return type;
	}



	public void setType(String type) {
		this.type = type;
	}

	

	

}

