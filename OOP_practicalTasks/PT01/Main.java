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
                .addProduct(new HotDrinks("Latte", 2.85, 300, 92))
                .addProduct(new HotDrinks("Americano", 1.50, 50, 86))
                .addProduct(new HotDrinks("Cappuccino", 2.30, 150, 90))
                .addProduct(new HotDrinks("Latte", 1.85, 200, 92));

        System.out.println(apparat);
        
        Product product = apparat.findProduct("Americano");

        System.out.println("-------------");
        System.out.println(product);

        System.out.println("-------------");
        Product soledProduct1 = apparat.saleProduct("Cappuccino");
        System.out.println(soledProduct1);
        Product soledProduct2 = apparat.saleProduct("Cappuccino");
        System.out.println(soledProduct2);

        System.out.println("Сумма в аппарате: ");
        System.out.println(apparat.getCash());

        System.out.println(apparat);

    }
}
