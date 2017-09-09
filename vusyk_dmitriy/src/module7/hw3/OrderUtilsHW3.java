package module7.hw3;

import module4.Currency;
import module7.hw1.Order;

import java.util.Iterator;
import java.util.TreeSet;

/**
 * Utils to module 7 homework 3 Main
 */
class OrderUtilsHW3 {

    static boolean checkOrderPerLastName(TreeSet<Order> orders, String lastName) {

        if (lastName == null) {
            throw new NullPointerException();
        }

        if (orders == null) {
            throw new NullPointerException();
        }

        for (Order order : orders) {
            if (order.getUser().getLastName().equalsIgnoreCase(lastName)) {
                return true;
            }
        }
        return false;
    }

    static void removeOrdersWithCurrency(TreeSet<Order> orders, Currency currency) {

        if (currency == null) {
            throw new NullPointerException();
        }

        if (orders == null) {
            throw new NullPointerException();
        }

        Iterator<Order> iterator = orders.iterator();

        while (iterator.hasNext()) {
            Order order = iterator.next();
            if (order.getCurrency().equals(currency)) {
                iterator.remove();
            }
        }

    }

}
