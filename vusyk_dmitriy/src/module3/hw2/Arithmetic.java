package module3.hw2;

/**
 * Created by dmytrovusyk on 12.02.17.
 * Напишите класс с названием Arithmetic с методом add, который принимает целые числа как параметры
 * и возвращает переменную типа integer, которая есть их суммой.
 * <p>
 * Напишите класс Adder, который наследуется от класса Arithmetic. У класса Adder должен быть метод
 * check, который сравнивает 2 номера и возвращает true, если а>=b и false в других случаях.
 * <p>
 * Сигнатура методов:
 * int add(Integer a, Integer b)
 * boolean check(Integer a, Integer b)
 */
public class Arithmetic {

    public static int add(Integer a, Integer b) {
        return a + b;
    }
}
