package module10.hw2;

/**
 * Создайте свой собственный класс исключений, используя ключевое слово extends.
 * Напишите конструктор для этого класса, который получает аргумент типа String
 * и хранит его внутри объекта как ссылку (reference) на String.
 * Написать метод, который выводит хранимую строку.
 * Создать try-catch-блоки, чтобы поупражняться на новом исключении.
 */
public class MyOwnException extends Exception {

    private String ownException;

    public MyOwnException(String string) {
        this.ownException = string;
    }

    public void printMyException() throws MyOwnException {
        throw new MyOwnException(ownException);
    }
}
