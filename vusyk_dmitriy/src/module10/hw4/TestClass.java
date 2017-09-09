package module10.hw4;

import module10.hw2.MyOwnException;

/**
 * Создайте класс с двумя методами f() и g().
 * <p>
 * <p>
 * В g() киньте (throw) исключение нового типа,который вы определили.
 * В f() вызовите g(),
 * поймайте его исключение и в блоке catch киньте другое исключение (другого типа, который вы определили).
 * Протестируйте свой код в main().
 */
class TestClass {

    void f() {
        try {
            g();
        } catch (MyOwnException e) {
            e.printStackTrace();
        }
    }

    void g() throws MyOwnException {
        throw new MyOwnException("New Exception");
    }
}
