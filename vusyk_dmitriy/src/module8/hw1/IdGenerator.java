package module8.hw1;

/**
 * Создайте enum класс Country со списком стран (страны произвольные, не меньше 5ти).
 * Создайте класс-утилиту IdGenerator, который будет генерировать
 * и возвращать уникальный идентификатор (реализацию продумайте самостоятельно).
 */

public final class IdGenerator {

    private static long marker = 0;

    private IdGenerator() {
    }

    public static long generateId() {
       return marker++;
    }
}
