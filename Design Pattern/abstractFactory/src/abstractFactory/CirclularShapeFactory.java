package abstractFactory;

import shapes.Circle;
import shapes.SemiCircle;
import shapes.Shape;

public class CirclularShapeFactory {
	public Shape getShape(String input)
	{
		switch (input) {
		
		case "CIRCLE": 
			return  new Circle();
		case "SEMICIRCLE":
			return  new SemiCircle();
		default:
			throw new IllegalArgumentException("Unexpected value: " + input);
		}
	}
}
