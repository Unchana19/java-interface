public class Main {
    public static void main(String[] args) {
        Store store = new Store();
        store.addProduct("Big Java", 300, 5);
        store.addProduct("Da Vinci Code", 120, 0);
        store.addProduct("Python 101", 200, 10);

        System.out.println(store.countProduct(new CounterAllProduct()));
        System.out.println(store.countProduct(new CounterProductInStock()));
        System.out.println(store.countProduct(new CounterProductQuantity()));
    }

    //อัญชนะ แจ้งเจริญ 6510405865
}