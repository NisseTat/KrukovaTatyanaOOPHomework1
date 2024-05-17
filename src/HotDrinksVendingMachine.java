import java.util.List;

public class HotDrinksVendingMachine implements VendingMachine {
    private List<HotDrink> productList;
//    private int money;
    private int volume;

    public HotDrinksVendingMachine(List<HotDrink> productList) {
        this.productList = productList;
    }

//    public int getMoney() {
//        return this.money;
//    }

//    public void setMoney(int money) {
//        this.money = money;
//    }

    @Override
    public HotDrink getProduct(String name, int drink_volume, int temperature) {
        for (HotDrink product : productList) {
            if (product.getName().equals(name) && (product.getTemperature() == temperature)) {
                volume = drink_volume;
                return product;
            }
        }
        return null;
    }

//    @Override
    public Product getProduct(String name) {
        for (Product product : productList) {
            if (product.getName().equals(name)) {
                return product;
            }
        }
        return null;
    }

    public List<HotDrink> getProductList() {
        return this.productList;
    }


//    @Override
//    public Product getProduct(String name) {
//        return null;
//    }
}
