package module6.hw4;


/**
 * Создайте класс-фабрику CitizenFactory, который будет статически генерировать граждан разных стран.
 * Используйте для этого следующие вложенные классы:
 * Englishman
 * Chinese
 * Russian
 * Italian
 * <p>
 * Каждый из вложенных классов реализует интерфейс Citizen. Метод sayHello() должен выводить фразу «Привет» на соответствующем языке.
 * Удостоверьтесь, что вложенные классы недоступны вне класса-фабрики.
 * <p>
 * Создайте класс CitizenMain с методом main, где проверьте работу CitizenFactory.
 */
class CitizenFactory {

    private static CitizenFactory citizenFactory;

    private CitizenFactory() {
    }

    private static CitizenFactory getInstance() {

        if (citizenFactory == null) {
            citizenFactory = new CitizenFactory();
        }

        return citizenFactory;
    }

    public static Citizen getCitizen(Nations nation) {

        switch (nation) {
            case ENGLISHMAN:

                return getInstance().new Englishman();

            case CHINESE:

                return getInstance().new Chinese();

            case RUSSIAN:

                return getInstance().new Russian();

            case ITALIAN:

                return getInstance().new Italian();
        }
        return null;
    }


    private class Englishman implements Citizen {

        @Override
        public void sayHello() {
            System.out.println("Hallo!");
        }
    }

    private class Chinese implements Citizen {

        @Override
        public void sayHello() {
            System.out.println("Ni Hao!");
        }
    }

    private class Russian implements Citizen {

        @Override
        public void sayHello() {
            System.out.println("Kuku epta!");
        }
    }

    private class Italian implements Citizen {

        @Override
        public void sayHello() {
            System.out.println("Salve!");
        }
    }
}
