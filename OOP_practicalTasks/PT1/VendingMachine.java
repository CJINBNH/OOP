package OOP_practicalTasks.PT1; 

abstract public class VendingMachine {

    public abstract int enterNumber();

    public abstract Product showProduct(int productNumber);

    public abstract void productBuy(Product product);

    public abstract void displayingListProducts();

}
