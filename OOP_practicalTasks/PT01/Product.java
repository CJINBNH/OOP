package OOP_practicalTasks.PT01;

public class Product {
    private String productName;
    private Double productPrice;

    public Product(String productName, Double productPrice) {
        this.productName = productName;
        this.productPrice = productPrice;
    }

    @Override
    public String toString() {
        return String.format("Продукт: %s, цена: %f", productName, productPrice);
    }
    
    public String getProductName() {
        return productName;
    }

    public Double getProductPrice() {
        return productPrice;
    }
    
}