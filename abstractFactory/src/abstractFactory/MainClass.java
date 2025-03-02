package abstractFactory;

import java.util.Scanner;

import shapes.Shape;

public class MainClass {
	public static void main(String args[]) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Hello there please Enter your shape type CIRCULAR OR RECTANGULAR");
		String shapeType=scanner.next();
		
		System.out.println("Please Enter your shape : CIRCLE or SEMICIRCLE or SQUARE or RECTANGLE");
		String shape=scanner.next();
			
		GlobalShapeFactory globalShapeFactory=new GlobalShapeFactory();
		
		Shape shape2=globalShapeFactory.getShape(shapeType, shape);
		shape2.draw();
		
	}
}


// two levels of factory means first one is deciding the type of shape
// then you will go to the second level which will deal with shape