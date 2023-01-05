// Выявите и реализуйте классы для следующей задачи. Пропишите необходимый минимум полей
// и методов. Пока что оставьте методы пустыми.
// Торговый автомат содержит в себе набор товаров.
// Покупатель вводит номер товара. Автомат высвечивает стоимость товара.
// Покупатель его оплачивает.
// Из лотка выпадает заказанный товар.

// Инкапсуляция
// 2. Доработайте задание:
// Проверьте все модификаторы видимости в ваших классах.
// Пропишите тела методов. Напишите main(), который демонстрирует,
// как работает торговый автомат.

// Наследование
// 3. Создайте несколько классов товаров.
// Они все наследуют от родительского класса Product.
// Товары обладают дополнительными характеристиками, которые отображаются в toString ().
// Загрузите в автомат много разнообразных товаров.

// Полиморфизм
// 4. Создайте три класса торговых автоматов.
// Используйте переопределение методов в детских классах.
// Большой торговый автомат — допускаются коды товаров от 0 до 99.
// Средний торговый автомат — допускаются коды товаров от 0 до 49.
// Торговый автомат, загруженный одним типом товаров.
// В этом случае нет нужды указывать код товара.

package OOP_seminars.seminar_01;

public class Main {
    public static void main (String[] args) {
        
        VkusVendingMachine vendingMachine = new VkusVendingMachine();
        
        vendingMachine.addProduct(1, new Product("Lays", 12345, 49, 20));
        vendingMachine.addProduct(2, new Product("Cola", 11111, 299, 1));
        vendingMachine.addProduct(3, new Product("Lipton", 22222, 99, 10));
        vendingMachine.addProduct(4, new Product("Milka", 15643, 150, 5));

        vendingMachine.displayingListProducts();
        System.out.println("Введите номер товара => ");
        int number = vendingMachine.enterNumber();
        Product product = vendingMachine.showProduct(number);
        vendingMachine.productBuy(product);

    }   

}