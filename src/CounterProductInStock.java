import java.util.List;

public class CounterProductInStock implements CounterProduct {
    @Override
    public int countProduct(List<Product> products) {
        int count = 0;
        for (Product product : products) {
            if (product.getQuantity() > 0) {
                count += 1;
            }
        }
        return count;
    }

    //อัญชนะ แจ้งเจริญ 6510405865
}
