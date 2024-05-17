import java.util.ArrayList;
import java.util.List;

public interface VendingMachine {

//    private List<Product> productList;
//    private Integer money;

    Product getProduct(String name, int volume, int temperature);

//    Product getProduct(String name);

//    public VendingMachine() {
//        this.productList = initProduct();
//        this.money = 0;
//    }
//    /**
//     * Сохраняет в себе список исходных продуктов
//     */
//    private List<Product> initProduct (List<Product>) {
//        List<Product> products = new ArrayList<>();
//
//        products.add(new Product("Молоко", 100));
//        products.add(new Product("Вода", 50));
//        products.add(new Product("Сухарики", 30);
//
//        return products;
//    }
//
//    public getProduct (String name) {
//        for (Product product : productList) {
//            if (product.getName().equals(name)) {
//                money += product.getPrice();
//                return product;
//            }
//        }
//        return null;
//    }
}
