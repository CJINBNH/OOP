package OOP_practicalTasks.PT01;

import java.util.ArrayList;
import java.util.List;

public class VendingMachine01 {
    private List<Product> vending = new ArrayList<>();

    private Double cash = 0.0;

    public VendingMachine01 addProduct(Product prod){
        vending.add(prod);
        return this;
    }

    public List<Product> getVending() {
        return vending;
    }

    public Product findProduct(String name){
        for (Product product : vending) {
            if (name.equals(product.getProductName())){
                return product;
            }
        }
        return null;
    }

    public Double getCash() {
        return cash;
    }

    public Product saleProduct(String nameProd){
        Product found = findProduct(nameProd);
        if (found != null){
            cash = cash + found.getProductPrice();
            vending.remove(found);
        }
        return found;
    }

    @Override
    public String toString(){
        StringBuilder builder = new StringBuilder();
        builder.append("Сумма денег в автомате: ").append(cash).append("\n");
        for (Product product : vending) {
            builder.append(product).append("\n");
        }
        return builder.toString();
    }
}
