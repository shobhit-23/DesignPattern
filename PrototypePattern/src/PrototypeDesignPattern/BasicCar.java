package PrototypeDesignPattern;

public class BasicCar implements Cloneable{
    public String modelName;
    public int basePrice,onRoadPrice;

    public String getModelName()
    {
        return modelName;
    }

    public void setModelName(String modelName)
    {
        this.modelName=modelName;
    }

    public static int setAdditionalPrice()
    {
        int price=10;
        return price;
    }

    public BasicCar clone() throws CloneNotSupportedException
    {
        return (BasicCar) super.clone();
    }
}
