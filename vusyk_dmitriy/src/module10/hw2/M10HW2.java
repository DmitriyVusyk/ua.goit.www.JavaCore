package module10.hw2;

/**
 * Создайте свой собственный класс исключений, используя ключевое слово extends.
 * Напишите конструктор для этого класса, который получает аргумент типа String
 * и хранит его внутри объекта как ссылку (reference) на String.
 * Написать метод, который выводит хранимую строку.
 * Создать try-catch-блоки, чтобы поупражняться на новом исключении.
 */
public class M10HW2 {

    public static void main(String[] args) {


        MyOwnException exception = new MyOwnException("This is exception from main");

        try {
            exception.printMyException();
        } catch (MyOwnException e) {
            System.out.println("My Exception is caught");
        }
    }
}
