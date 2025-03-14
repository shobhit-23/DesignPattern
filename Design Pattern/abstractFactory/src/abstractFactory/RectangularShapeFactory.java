package abstractFactory;

import shapes.Rectangle;
import shapes.Shape;
import shapes.Square;

public class RectangularShapeFactory {
	public Shape getShape(String input)
	{
		switch (input) {
		
		case "SQUARE": 
			return  new Square();
		case "RECTANGLE":
			return  new Rectangle();
		default:
			throw new IllegalArgumentException("Unexpected value: " + input);
		}
	}
}
