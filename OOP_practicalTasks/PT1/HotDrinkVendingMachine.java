package OOP_practicalTasks.PT1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HotDrinkVendingMachine extends VendingMachine {

    private Map<Integer, HotDrink> hotDrinksMap = new HashMap<>();
    private Scanner scanner = new Scanner(System.in);
    
    public void addHotDrink (int key, HotDrink hotDrink) {
        hotDrinksMap.put(key, hotDrink);
        
    }


    @Override
    public int enterNumber() {
        int hotDrinkNumber = scanner.nextInt();
        System.out.println("Покупатель ввел номер " + hotDrinkNumber);
        return hotDrinkNumber;
    }

    @Override
    public HotDrink showProduct (int hotDrinkNumber) {
        System.out.println("Выбранный продукт: " + hotDrinksMap.get(hotDrinkNumber));
        return hotDrinksMap.get(hotDrinkNumber);
    }

    @Override
    public void productBuy(Product product) {
        System.out.println("Внесите указанную сумму: ");
        float deposit = 0f;
        while (true) {
            int cash = scanner.nextInt();
            System.out.printf("Вы внесли %d руб.\n", cash);
            deposit += cash;
            if (deposit < product.getPrice()) {
                System.out.printf("Для покупки не хватает %.2f руб.\n", product.getPrice() - deposit);

            } else if (deposit > product.getPrice()){
                System.out.printf("Возьмите сдачу %.2f руб.\n", deposit - product.getPrice());
                System.out.println("Заберите напиток.");
                getProduct(product);
                break;
            } else {
                System.out.println("Заберите напиток.");
                getProduct(product);
                break;
            }
        }
        System.out.println("Спасибо за покупку!!!");
    }

    private void getProduct(Product product) {
        int amountGoods = product.getAmount();
        product.setAmount(amountGoods - 1);
        System.out.println("Доступно для заказа " + product.getAmount());
    }

    @Override
    public void displayingListProducts() {
        System.out.println("Вы можете приобрести следующие напитки => ");
        for (HashMap.Entry<Integer, HotDrink> item : hotDrinksMap.entrySet()) {
            System.out.printf("%d - %s %s температура %d град.\n", item.getKey(), item.getValue().getType(), item.getValue().getName(), item.getValue().getTemperature());
        } 
    }
}
