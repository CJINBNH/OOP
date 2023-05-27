// Создать торговый кофейный автомат, напитки в автомате должны содержать следующие данные:
// наименование, объем, температура, цена. Проинициализировать несколько напитков в классе
// main и торговый автомат, воспроизвести логику продажи напитков. Сделать согласно 
// принципам ООП, пройденным на семинаре.

package OOP_practicalTasks.PT01;

public class Main {
    public static void main(String[] args) {
        VendingMachine01 apparat = new VendingMachine01();
        apparat.addProduct(new HotDrinks("Americano", 2.50, 100, 86))
                .addProduct(new HotDrinks("Cappuccino", 3.30, 250, 90))
                .addProduct(new HotDrinks("Latte", 2.85, 300, 92));

        for (Product product : apparat.getVending()) {
            System.out.println(product);
        }
    }
}
