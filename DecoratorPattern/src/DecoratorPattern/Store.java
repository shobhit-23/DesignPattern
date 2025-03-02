package DecoratorPattern;

public class Store {
	
	public static void main(String[] args) {
		//Order a simple Coffee
		Coffee coffee=new SimpleCoffee();
		System.out.println("Cost: Rs"+ coffee.getCost() + " Description: "+coffee.getDescription());
		
		//Decorate it with milk
		coffee =new Milk(coffee);
		System.out.println("Cost: Rs"+ coffee.getCost() + " Description: "+coffee.getDescription());
		
		//Decorate with sugar
		coffee=new Sugar(coffee);
		System.out.println("Cost: Rs"+ coffee.getCost() + " Description: "+coffee.getDescription());
		
	}
}
