// При решении этих задач следуйте принципам абстракции, инкапсуляции, наследования,
// полиморфизма.
// Создайте унаследованный класс ГорячийНапиток с дополнительным полем int температура.
// Создайте класс АвтоматГорячихНапитков, реализующий интерфейс ТорговыйАвтомат и
// реализуйте перегруженный метод getProduct(int name, int volume, int temperature),
// выдающий продукт, соответствующий имени, объему и температуре.
// В main проинициализируйте несколько ГорячихНапитков и АвтоматГорячихНапитков и
// позвольте покупателю купить товар.

package OOP_practicalTasks.PT1;

public class Main {
    public static void main (String[] args) {
        
        HotDrinkVendingMachine hotDrinkVendingMachine = new HotDrinkVendingMachine();

        hotDrinkVendingMachine.addHotDrink(1, new HotDrink("латте", "Paulig", 001001, 299.99f, 0.2f, 100, 75));
        hotDrinkVendingMachine.addHotDrink(2, new HotDrink("капучино", "Lavazza", 001002, 299.99f, 0.2f, 100, 75));
        hotDrinkVendingMachine.addHotDrink(3, new HotDrink("американо", "Vergnano", 001003, 299.99f, 0.25f, 100, 80));
        hotDrinkVendingMachine.addHotDrink(4, new HotDrink("эспрессо", "Molinari", 001004, 299.99f, 0.25f, 100, 80));
    
        hotDrinkVendingMachine.displayingListProducts();
        System.out.println("Введите номер выбранного напитка => ");
        int number = hotDrinkVendingMachine.enterNumber();
        HotDrink hotDrink = (HotDrink) hotDrinkVendingMachine.showProduct(number);
        hotDrinkVendingMachine.productBuy(hotDrink);

    }   
}
