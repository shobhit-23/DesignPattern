package PrototypeDesignPattern;

public class Client {
    // you create the shalloq copy of every object by implementing the clone method.
    public static void main(String[] args) throws CloneNotSupportedException {

        BasicCar nano= new Nano("Green Nano");
        nano.basePrice=100000;

        BasicCar ford= new Ford("Ford Yellow");
        ford.basePrice=50000;

        BasicCar bc1;
        // nano clone
        bc1=nano.clone();
        //Price will be more now
        bc1.onRoadPrice= nano.basePrice+ BasicCar.setAdditionalPrice();
        System.out.println("Car is:"+bc1.modelName+" and price is:"+ bc1.onRoadPrice);

        BasicCar bc2;
        // nano clone
        bc2=ford.clone();
        //Price will be more now
        bc2.onRoadPrice= ford.basePrice+ BasicCar.setAdditionalPrice();
        System.out.println("Car is:"+bc2.modelName+" and price is:"+ bc2.onRoadPrice);


    }
}
