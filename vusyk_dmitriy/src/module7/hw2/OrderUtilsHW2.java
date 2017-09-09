package module7.hw2;


import module7.hw1.Order;

import java.util.Comparator;
import java.util.List;

/**
 * OrderUtilsHW2 methods to javacore.module7.hw2.Main
 */
class OrderUtilsHW2 {

    static void sortPriceDecreased(List<Order> list) {
        list.sort(new Comparator<Order>() {
            @Override
            public int compare(Order o1, Order o2) {
                return o2.getPrice() - o1.getPrice();
            }
        });
    }

    static void sortPriceIncreasedAndCity(List<Order> list) {
        list.sort(new Comparator<Order>() {
            @Override
            public int compare(Order o1, Order o2) {
                if (o1.getPrice() - o2.getPrice() == 0) {
                    return o1.getUser().getCity().compareToIgnoreCase(o2.getUser().getCity());
                }

                return o1.getPrice() - o2.getPrice();
            }
        });
    }

    static void sortItemNameShopNameUserCity(List<Order> list) {
        list.sort(new Comparator<Order>() {
            @Override
            public int compare(Order o1, Order o2) {

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
            }
        });

    }
}
