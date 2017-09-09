package module10.hw5;

import module7.hw1.Order;

/**
 * Создайте три новых типа исключений.
 * Напишите класс с методом, который будет кидать все три из них.
 * В main() вызовите этот метод, но используйте только один catch-блок
 * который будет ловить все три типа исключений.
 */

class MyOwnExceptions {

    public static void testMethod() throws Exception1, Exception2, Exception3 {
        Order order = null;
        order.getCurrency();
        int a = 2 / 0;
        int arr[] = {1, 2, 3};
        arr[5] = 2;
    }

    public static class Exception1 extends NullPointerException {
        public Exception1() {
            super("Exception 1");
        }
    }

    public static class Exception2 extends IndexOutOfBoundsException {
        public Exception2(String s) {
            super("Exception2");
        }
    }

    public static class Exception3 extends ArithmeticException {
        public Exception3(String s) {
            super("Exception3");
        }
    }
}
