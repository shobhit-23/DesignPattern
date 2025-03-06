import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Inventory {
    private final Map<Product,Integer> products;

    public Inventory() {
        products= new ConcurrentHashMap<>();
    }
    public void addProducts(Product product, int quantity)
    {
        products.put(product,quantity);
    }
    public void removeProducts(Product product)
    {
        products.remove(product);
    }
    public void updateQunatity(Product product, int quantity)
    {
        products.put(product,quantity);
    }
    public Integer getQuantity(Product product) {
        return products.getOrDefault(product, 0);
    }
    public boolean isAvailable(Product product)
    {
        return products.getOrDefault(product,0)>0;
    }
}
