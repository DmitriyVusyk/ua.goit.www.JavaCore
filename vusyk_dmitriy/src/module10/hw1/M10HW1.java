package module10.hw1;

/**
 * Создайте класс с main(), который закидывает (throws) объект класса Exception внутрь try-блока.
 * <p>
 * <p>
 * Задайте конструктору исключения (Exception) аргумент типа String.
 * <p>
 * <p>
 * Поймайте (catch) исключение внутри catch-блока и выведитe String argument.
 * Добавьте finally-блок и выведите сообщение в доказательство того, что он вызывался.
 */
public class M10HW1 {
    public static void main(String[] args) {

        try {
            throw new Exception("Exception in try block");
        } catch (Exception e) {
            System.out.println("Exception caught");
        } finally {
            System.out.println("Finally block is called");
        }
    }
}
