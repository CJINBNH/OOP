package OOP_practicalTasks.PT01;

public class HotDrinks extends Drinks {
    private Integer hotDrinkTemperature;

    public HotDrinks(String productName, Double productPrice, Integer productVolume,
                    Integer hotDrinkTemperature) {
        super(productName, productPrice, productVolume);
        this.hotDrinkTemperature = hotDrinkTemperature;
    }

    public Integer gethotDrinkTemperature() {
        return hotDrinkTemperature;
    }

    public void sethotDrinkTemperature(Integer hotDrinkTemperature) {
        this.hotDrinkTemperature = hotDrinkTemperature;
    }

    @Override
    public String toString() {
        return String.format("Кофе: %s, Температура: %d", super.toString(), hotDrinkTemperature);
    }
}
