package FactoryPattern;

public class MainClass {
	public static void main(String args[]) {
		ShapeFactory shapeFactory= new ShapeFactory();
		
		Shape circleShape= shapeFactory.getShape("CIRCLE");
		circleShape.draw();
		
		Shape rectangleShape= shapeFactory.getShape("RECTANGLE");
		rectangleShape.draw();
	}
}


// Suppose if user is giving you input uml the shape
// like give me object of circle then you will have to write this code 
//Shape getShape(String input)
//{
//	switch (input) {
//	
//	case "CIRCLE": 
//		return  new Circle();
//	case "RECTANGLE":
//		return  new Rectangle();
//	default:
//		throw new IllegalArgumentException("Unexpected value: " + input);
//	}
//}
//Again and again so its better to maintain a factory that will take input and give you output
//And suppose if you have added a new Shape then you will have to edit your code at every place 
// for above code so it will violate violating the Open/Closed Principle (OCP)
//That's why its better to maintain a factory