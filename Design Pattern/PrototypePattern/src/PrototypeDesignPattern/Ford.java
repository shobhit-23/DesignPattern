package PrototypeDesignPattern;

public class Ford extends BasicCar{
    //base Price
    public int basePrice=10000;

    public Ford(String m)
    {
        modelName=m;
    }

    @Override
    public BasicCar clone() throws CloneNotSupportedException{
        return (Ford) super.clone();
    }
}
