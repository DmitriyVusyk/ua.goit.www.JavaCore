package module9;


import module4.Currency;

import java.util.Arrays;
import java.util.List;

/**
 * Используйте структуры с HW модуля 7 (User и BookingInfo) и выполните задания, используя Java 8 instruments
 * <p>
 * + отсортируйте список за ценой заказа по убыванию
 * + отсортируйте список за ценой заказа по возрастанию и за городом пользователя
 * + отсортируйте список за наименованием товара, идентификатором заказа, и городом пользователя
 * <p>
 * + удалите дублированные данные со списка
 * + удалите объекты, где цена меньше 1500
 * + разделите список на 2 списка - заказы в долларах и в гривнах
 * + разделите список на столько списков, сколько уникальных городов в User
 * <p>
 * +проверьте, содержит ли сет заказ, где фамилия пользователя - “Petrov”
 * -удалите заказы в USD
 * <p>
 * Ограничения:
 * -нельзя использовать итератор
 * -нельзя использовать циклы
 * <p>
 * Определите каждую подзадачу в отдельный метод.
 * Создайте класс Main и протестируйте каждый метод на тестовых данных.
 */
public class Main {

    public static void main(String[] args) {

        User user1 = new User(1, "Boris", "Britva", "aaa", 1000);
        User user2 = new User(2, "Alex", "Bear", "ccc", 2000);
        User user3 = new User(3, "David", "Garcia", "bbb", 3000);
        User user4 = new User(4, "Alex", "Gustavson", "aaa", 4000);
        User user5 = new User(5, "Richard", "Konrad", "bbb", 5000);
        User user6 = new User(6, "Stefan", "Klark", "ccc", 6000);
        User user7 = new User(7, "Ludvig", "Beethoven", "aaa", 7000);
        User user8 = new User(8, "Amadeus", "Mozart", "bbb", 8000);
        User user9 = new User(8, "David", "Koperfield", "ccc", 9000);
        User user10 = new User(10, "Will", "Smith", "aaa", 10000);

        Order order1 = new Order(1, 100, Currency.USD, "item1", "shop1", user1);
        Order order2 = new Order(2, 500, Currency.UAH, "item1", "Shop2", user2);
        Order order3 = new Order(3, 300, Currency.EUR, "item1", "shop2", user3);
        Order order4 = new Order(4, 400, Currency.USD, "item2", "shop4", user4);
        Order order5 = new Order(1, 100, Currency.UAH, "item1", "shop1", user1);
        Order order6 = new Order(6, 600, Currency.USD, "item2", "shop4", user6);
        Order order7 = new Order(7, 700, Currency.EUR, "item3", "shop7", user7);
        Order order8 = new Order(8, 800, Currency.USD, "item3", "shop8", user8);
        Order order9 = new Order(9, 900, Currency.EUR, "item3", "shop9", user9);
        Order order10 = new Order(10, 2000, Currency.USD, "item5", "shop10", user10);

        Order[] orders = {order1, order2, order3, order4, order5, order6, order7, order8, order9, order10};
        List<Order> orderList = Arrays.asList(orders);

        System.out.println("Список за ценой заказа по убыванию");
        System.out.println(Java8Utils.sortOrdersByPriceDown(orderList));
        System.out.println("============================================================================================================");

        System.out.println("список за ценой заказа по возрастанию и за городом пользователя");
        System.out.println(Java8Utils.sortOrdersByPriceUpAndCity(orderList));
        System.out.println("============================================================================================================");

        System.out.println("список за наименованием товара, идентификатором заказа, и городом пользователя");
        System.out.println(Java8Utils.sortByNameShopCity(orderList));
        System.out.println("============================================================================================================");

        System.out.println("удалите дублированные данные со списка");
        System.out.println(Java8Utils.removeSimilarOrders(orderList));
        System.out.println("============================================================================================================");

        System.out.println("удалите объекты, где цена меньше 1500");
        System.out.println(Java8Utils.removeIfPriceLessThan(orderList, 1500));
        System.out.println("============================================================================================================");

        System.out.println("заказы в долларах и в гривнах");
        System.out.println(Java8Utils.apparitionPerCurrency(orderList, Currency.USD, Currency.UAH));
        System.out.println("============================================================================================================");

        System.out.println("разделите список на столько списков, сколько уникальных городов в User");
        System.out.println(Java8Utils.apparitionPerCity(orderList));
        System.out.println("============================================================================================================");

        System.out.println("проверьте, содержит ли сет заказ, где фамилия пользователя - “Petrov”");
        System.out.println(Java8Utils.checkOrderPerName(orderList,"petrov"));
        System.out.println("============================================================================================================");

        System.out.println("удалите заказы в USD");
        System.out.println(Java8Utils.deleteOrdersWithCurrancy(orderList, Currency.USD));
        System.out.println("============================================================================================================");

    }

}
