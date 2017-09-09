package module9;

import module4.Currency;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Используйте структуры с HW модуля 7 (User и BookingInfo) и выполните задания, используя Java 8 instruments
 * <p>
 * + отсортируйте список за ценой заказа по убыванию
 * + отсортируйте список за ценой заказа по возрастанию и за городом пользователя
 * + отсортируйте список за наименованием товара, идентификатором заказа, и городом пользователя
 * <p>
 * + удалите дублированные данные со списка
 * +удалите объекты, где цена меньше 1500
 * +разделите список на 2 списка - заказы в долларах и в гривнах
 * +разделите список на столько списков, сколько уникальных городов в User
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


class Java8Utils {

    private Java8Utils() {
    }

    public static List<Order> sortOrdersByPriceDown(List<Order> list) {
        list.sort(Comparator.comparing(Order::getPrice).reversed());
        return list;
    }

    public static List<Order> sortOrdersByPriceUpAndCity(List<Order> list) {
        list.sort((Order o1, Order o2) -> {

            int result = o1.getPrice() - o2.getPrice();

            if (result == 0) {
                result = o1.getUser().getCity().compareToIgnoreCase(o2.getUser().getCity());
                return result;
            }
            return result;
        });
        return list;
    }

    public static List<Order> sortOrdersByPriceUpAndCity2(List<Order> list) {

        list.sort(Comparator.comparing(Order::getPrice)
                .thenComparing(
                        (order1, order2)
                                -> (order1.getUser().getCity().compareToIgnoreCase(order2.getUser().getCity()))));

        return list;
    }

    public static List<Order> sortByNameShopCity(List<Order> list) {
        list.sort((Order o1, Order o2) -> {

            int result = o1.getItemName().compareToIgnoreCase(o2.getItemName());
            if (result == 0) {
                result = o1.getShopIdentificator().compareToIgnoreCase(o2.getShopIdentificator());
                if (result == 0) {
                    result = o1.getUser().getCity().compareToIgnoreCase(o2.getUser().getCity());
                    if (result == 0) {
                        return 1;
                    }
                }
            }
            return result;
        });
        return list;
    }

    public static List<Order> sortByNameShopCity2(List<Order> list) {
        list.sort(Comparator.comparing(Order::getItemName)
                .thenComparing(Order::getShopIdentificator)
                .thenComparing(
                        (order1, order2)
                                -> (order1.getUser().getCity().compareToIgnoreCase(order2.getUser().getCity()))));
        return list;
    }


    public static List<Order> removeSimilarOrders(List<Order> list) {
        return list.stream().sorted().distinct().collect(Collectors.toList());
    }

    public static List<Order> removeIfPriceLessThan(List<Order> list, int price) {
        return list.stream().filter(order -> order.getPrice() > price).collect(Collectors.toList());
    }

    public static List<List<Order>> apparitionPerCurrency(List<Order> list, Currency currency1, Currency currency2) {
        List<List<Order>> sortedList = new ArrayList<>();
        sortedList.add(list.stream().distinct().filter(order -> order.getCurrency().equals(currency1)).collect(Collectors.toList()));
        sortedList.add(list.stream().distinct().filter(order -> order.getCurrency().equals(currency2)).collect(Collectors.toList()));
        return sortedList;
    }

    public static Map<String, List<Order>> apparitionPerCity(List<Order> list) {
        return list.stream().distinct().collect(Collectors.groupingBy((order) -> order.getUser().getCity()));
    }

    public static boolean checkOrderPerName(List<Order> list, String lastname) {
        return list.stream().anyMatch(order -> order.getUser().getLastName().equalsIgnoreCase(lastname));
    }

    public static List<Order> deleteOrdersWithCurrancy(List<Order> list, Currency currency) {
        return list.stream().filter(order -> !order.getCurrency().equals(currency)).collect(Collectors.toList());
    }
}