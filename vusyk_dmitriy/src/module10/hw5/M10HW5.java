package module10.hw5;

import static module10.hw5.MyOwnExceptions.testMethod;

/**
 * Создайте три новых типа исключений.
 * Напишите класс с методом, который будет кидать все три из них.
 * В main() вызовите этот метод, но используйте только один catch-блок
 * который будет ловить все три типа исключений.
 */
public class M10HW5 {




    public static void main(String[] args) {
        try {
            testMethod();
        } catch (Exception e) {
            System.out.println("Exception caught?");
        }
    }

}
