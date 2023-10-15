import java.util.List;

public class CounterProductQuantity implements CounterProduct {
    @Override
    public int countProduct(List<Product> products) {
        int count = 0;
        for (Product product : products) {
            count += product.getQuantity();
        }
        return count;
    }

    //อัญชนะ แจ้งเจริญ 6510405865
}
