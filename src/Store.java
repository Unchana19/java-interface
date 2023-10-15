import java.util.ArrayList;
import java.util.List;

public class Store {
    private List<Product> products;

    public Store() {
        products = new ArrayList<>();
    }

    public void addProduct(String name, double price, int quantity) {
        products.add(new Product(name, price, quantity));
    }

    public int countProduct(CounterProduct counterProduct) {
        return counterProduct.countProduct(products);
    }

    public List<Product> getProducts() {
        return products;
    }

    //อัญชนะ แจ้งเจริญ 6510405865
}
