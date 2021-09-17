// Jakob Evans
// 9/15/21
// Method Overriding

package com.cognixia.jump.comparablePractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OverridingRunner {
	public static void main(String[] args) {
			
			List<Shape> myShapes = new ArrayList<>();
			
		
			myShapes.add(new Shape());
			myShapes.add(new Shape());

			myShapes.add(new Square("red", 5));
			myShapes.add(new Square("red", 30));
			myShapes.add(new Square("red", 2));
			myShapes.add(new Square("red", 25));
			myShapes.add(new Square("red", 3));
			myShapes.add(new Square("red", 7));
			myShapes.add(new Square("red", 15));

			
			myShapes.add(new Circle("red", 5));
			myShapes.add(new Circle("red", 30));
			myShapes.add(new Circle("red", 2));
			myShapes.add(new Circle("red", 25));
			myShapes.add(new Circle("red", 3));
			myShapes.add(new Circle("red", 7));
			myShapes.add(new Circle("red", 15));


			
			// sort by area using comparable interface / compareTo
			Collections.sort(myShapes);
			
			for (Shape shape : myShapes) {
				shape.printShapeData();
				System.out.println("The area is --> " + shape.Area());
				System.out.println("--------------------------------\n");

			}
			
		}
}
