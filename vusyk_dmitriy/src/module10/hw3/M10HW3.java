package module10.hw3;

import module7.hw1.Order;

/**
 * Определите ссылку (reference) на объект и инициализируйте ее как null.
 * Попробуйте вызвать метод через эту ссылку.
 * Потом оберните этот код в try-catch-блок, чтобы поймать исключение.
 */
public class M10HW3 {

    public static void main(String[] args) {
        Order nullOrder = null;
        try {
            nullOrder.getCurrency();
        } catch (Exception e) {
            System.out.println("caught");
        }
    }
}
