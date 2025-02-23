package VisitorDesignPattern;

public class RoomPricingVisitor implements RoomVisitor{

	@Override
	public void visit(SingleRoom singleRoom) {
		System.out.println("Pricing computation logic at SingleRoom");
		singleRoom.price=1000;
	}

	@Override
	public void visit(DoubleRoom doubleRoom) {
		System.out.println("Pricing computation logic at DoubleRoom");
		doubleRoom.price=2000;
	}

	@Override
	public void visit(DeluxeRoom deluxeRoom) {
		System.out.println("Pricing computation logic at DeluxeRoom");
		deluxeRoom.price=3000;
	}

}
