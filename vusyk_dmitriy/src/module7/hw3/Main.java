package module7.hw3;


import module4.Currency;
import module7.hw1.Order;
import module7.hw1.User;


import java.util.TreeSet;

/**
 * Создайте класс Main, где создайте 10 заказов с 10 пользователями и добавьте его в TreeSet.
 * Создайте 8 уникальных и 2 дублированых заказа.
 * <p>
 * -проверьте, содержит ли сет заказ, где фамилия пользователя - “Petrov”
 * -выведите заказ с наибольшей ценой, исспользуя только один сет-метод - get
 * -удалите заказы, где валюта доллар, используя Iterator
 */
class Main {

    public static void main(String[] args) {

        TreeSet<Order> orderSet = new TreeSet<>();

        User user1 = new User(1, "Boris", "Britva", "a", 1000);
        User user2 = new User(2, "Alex", "Bear", "c", 2000);
        User user3 = new User(3, "David", "Garcia", "f", 3000);
        User user4 = new User(4, "Alex", "Gustavson", "d", 4000);
        User user5 = new User(5, "Richard", "Konrad", "e", 5000);
        User user6 = new User(6, "Stefan", "Klark", "d", 6000);
        User user7 = new User(7, "Ludvig", "Beethoven", "g", 7000);
        User user8 = new User(8, "Amadeus", "Mozart", "j", 8000);
        User user9 = new User(8, "David", "Koperfield", "k", 9000);
        User user10 = new User(10, "Will", "Smith", "l", 10000);

        Order order1 = new Order(1, 100, Currency.USD, "item1", "shop1", user1);
        Order order2 = new Order(2, 200, Currency.USD, "item1", "Shop2", user2);
        Order order3 = new Order(3, 300, Currency.EUR, "item1", "shop2", user3);
        Order order4 = new Order(1, 100, Currency.USD, "item1", "shop1", user1);
        Order order5 = new Order(5, 500, Currency.USD, "item2", "shop5", user5);
        Order order6 = new Order(6, 600, Currency.USD, "item2", "shop4", user6);
        Order order7 = new Order(7, 700, Currency.USD, "item3", "shop7", user7);
        Order order8 = new Order(8, 800, Currency.USD, "item3", "shop8", user8);
        Order order9 = new Order(9, 900, Currency.USD, "item3", "shop9", user9);
        Order order10 = new Order(10, 1000, Currency.USD, "item5", "shop10", user10);

        orderSet.add(order1);
        orderSet.add(order2);
        orderSet.add(order3);
        orderSet.add(order4);
        orderSet.add(order5);
        orderSet.add(order6);
        orderSet.add(order7);
        orderSet.add(order8);
        orderSet.add(order9);
        orderSet.add(order10);

        System.out.println("Original orderSet: ");
        System.out.println(orderSet);
        System.out.println("==================================================");

        System.out.println("Check BookingInfo which contains user with lastname: ");
        System.out.println(OrderUtilsHW3.checkOrderPerLastName(orderSet, "Petrov"));
        System.out.println("==================================================");


        // Class BookingInfo implements Comparable and will be sorted with greatest price
        System.out.println("BookingInfo with greatest Price: ");
        System.out.println(orderSet.last());
        System.out.println("==================================================");

        System.out.println("Remove all Orders with currency USD: ");
        OrderUtilsHW3.removeOrdersWithCurrency(orderSet, Currency.USD);
        System.out.println(orderSet);
        System.out.println("==================================================");


    }
}
