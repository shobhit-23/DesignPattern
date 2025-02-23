package VisitorDesignPattern;

public class Client {
	public static void main(String args[])
	{
		RoomElement singleRoomObj= new SingleRoom();
		RoomElement doubleRoomObj= new DoubleRoom();
		RoomElement deluxeRoomObj= new DeluxeRoom();
		
		//performing objects on getting price
		RoomVisitor pricingVisitorObj= new RoomPricingVisitor();
		singleRoomObj.accept(pricingVisitorObj);
		System.out.println(((SingleRoom)singleRoomObj).price);
		
		doubleRoomObj.accept(pricingVisitorObj);
		System.out.println(((DoubleRoom)doubleRoomObj).price);
		
		deluxeRoomObj.accept(pricingVisitorObj);
		System.out.println(((DeluxeRoom)deluxeRoomObj).price);
		
		// performing maintenance operation
		RoomVisitor maintenanceVisitorObj=new RoomMaintenanceVisitor();
		
		singleRoomObj.accept(maintenanceVisitorObj);
		doubleRoomObj.accept(maintenanceVisitorObj);
		deluxeRoomObj.accept(maintenanceVisitorObj);
	}
}
