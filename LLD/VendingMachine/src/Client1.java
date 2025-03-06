public class Client1 {
    public static void main(String[] args) {
        VendingMachine vendingMachine=VendingMachine.getInstance();

        //create Products
        Product coke=new Product("Coke",1.5);
        Product pepsi= new Product("Pepsi",1.5);
        Product water=new Product("Water",1.0);

        //Adding Products to inventory
        vendingMachine.inventory.addProducts(coke,5);
        vendingMachine.inventory.addProducts(pepsi,3);
        vendingMachine.inventory.addProducts(water,2);

        //Now user comes and select a product
        vendingMachine.selectProduct(coke);

        //Inserting coin
        vendingMachine.insertCoin(Coin.QUARTER);

        //Inserting Note
        vendingMachine.insertNote(Note.FIVE);

        //Dispense the product
        vendingMachine.dispenseProduct();

        //return change
        vendingMachine.returnChnage();

    }
}
