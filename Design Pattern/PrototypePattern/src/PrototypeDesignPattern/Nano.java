package PrototypeDesignPattern;

public class Nano extends BasicCar{
    public int basePrice=50000;

    public Nano(String m)
    {
        modelName=m;
    }

    @Override
    public BasicCar clone() throws CloneNotSupportedException
    {
        return (BasicCar) super.clone();
    }
}
