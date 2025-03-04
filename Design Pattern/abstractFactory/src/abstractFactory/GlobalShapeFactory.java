package abstractFactory;

import shapes.Shape;

public class GlobalShapeFactory {
	public Shape getShape(String shapeType,String shape)
	{
		switch(shapeType) {
		case "RECTANGULAR":
		{
			RectangularShapeFactory rectangularShapeFactory= new RectangularShapeFactory();
			return rectangularShapeFactory.getShape(shape);
		}
		case "CIRCULAR":
		{
			CirclularShapeFactory circlularShapeFactory=new CirclularShapeFactory();
			return circlularShapeFactory.getShape(shape);
		}
		default:
			return null;
		}
	}
}
