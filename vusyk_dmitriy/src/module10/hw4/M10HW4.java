package module10.hw4;


/**
 * Создайте класс с двумя методами f() и g().
 * <p>
 * <p>
 * В g() киньте (throw) исключение нового типа,который вы определили.
 * В f() вызовите g(),
 * поймайте его исключение и в блоке catch киньте другое исключение (другого типа, который вы определили).
 * Протестируйте свой код в main().
 */
public class M10HW4 {

    public static void main(String[] args) {
        TestClass testClass = new TestClass();

        testClass.f();
    }
}
