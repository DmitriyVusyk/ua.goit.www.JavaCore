package module6.hw4;


/**
 * Создайте класс CitizenMain с методом main, где проверьте работу CitizenFactory.
 */
public class CitizenMain {

    public static void main(String[] args) {

        Citizen eng = CitizenFactory.getCitizen(Nations.ENGLISHMAN);
        Citizen chi = CitizenFactory.getCitizen(Nations.CHINESE);
        Citizen rus = CitizenFactory.getCitizen(Nations.RUSSIAN);
        Citizen it = CitizenFactory.getCitizen(Nations.ITALIAN);

        eng.sayHello();
        chi.sayHello();
        rus.sayHello();
        it.sayHello();
    }
}
