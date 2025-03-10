package coffeevendingmachine;

public class Client {
    public static void main(String[] args) {
        CoffeeMachine coffeeMachine= CoffeeMachine.getInstance();

        //Display coffee menu
        coffeeMachine.displayMenu();

        //Simulate user requests
        Coffee espresso = coffeeMachine.selectCoffee("Espresso");
        coffeeMachine.dispenseCoffee(espresso, new Payment(3.0));

    }
}
