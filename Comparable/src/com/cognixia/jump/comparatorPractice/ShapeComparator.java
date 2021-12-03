// Jakob Evans
// 9/15/21
// Method Overriding

package com.cognixia.jump.comparatorPractice;


public class ShapeComparator implements Comparable<ShapeComparator> {
	
	public Double Area() {
		System.out.println("I am in the parents area function (ShapeComparator class)");
		return 0.0;
	}
	
	private String color;
	private String type;
	
	
	
	// Compare by area to sort by least to greatest area
	@Override
	public int compareTo(ShapeComparator otherShapeComparator) {
		
		if(this.Area() == otherShapeComparator.Area()) {
			return 0;
		}
		else if(this.Area() > otherShapeComparator.Area()) {
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

