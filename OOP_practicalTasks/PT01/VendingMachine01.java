package OOP_practicalTasks.PT01;

import java.util.ArrayList;
import java.util.List;

public class VendingMachine01 {
    private List<Product> vending = new ArrayList<>();

    public VendingMachine01 addProduct(Product prod){
        vending.add(prod);
        return this;
    }

    public List<Product> getVending() {
        return vending;
    }
}
