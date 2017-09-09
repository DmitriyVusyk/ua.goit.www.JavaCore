package module3.hw1;

/**
 * Created by dmytrovusyk on 12.02.17.
 * Добавить метод sing к классу Bird, потом измените основной метод соответственно, чтобы код вывел следующий текст:
 * I am walking
 * I am flying
 * I am singing
 * I am Bird
 */
public class Bird {

    public void sing(String someText) {
        System.out.println("I am " + someText);
    }

    public void sing(String phrase[]) {
        for (String string : phrase) {
            System.out.println("I am " + string);
        }
    }
}
