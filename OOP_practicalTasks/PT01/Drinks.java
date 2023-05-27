package OOP_practicalTasks.PT01;

public class Drinks extends Product {
    private Integer drinkVolume;

    public Drinks(String productName, Double productPrice, Integer drinkVolume) {
        super(productName, productPrice);
        this.drinkVolume = drinkVolume;
    }

    public Integer getdrinkVolume() {
        return drinkVolume;
    }

    public void setdrinkVolume(Integer drinkVolume) {
        this.drinkVolume = drinkVolume;
    }

    @Override
    public String toString() {
        return String.format("Напиток: %s, Объем: %d", super.toString(), drinkVolume);
    }
}
