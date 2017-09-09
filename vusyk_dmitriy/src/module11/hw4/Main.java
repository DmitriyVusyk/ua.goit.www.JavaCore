package module11.hw4;

import module11.M11Utils;

import java.io.File;
import java.io.IOException;


/**
 * Проверить, содержит ли файл конкретное слово. Вывести 0, если нет.
 * Вывести номер n, который эквивалентен числу появлений этого слова в файле.
 * int checkWord(String word)
 * Написать это задание с обычным try и try-with-resources(две версии).
 */
class Main {
    private static final String FILEPATH = "/Users/dmytrovusyk/IdeaProjects/GoIT_Group9/vusyk_dmitriy/src/module11/hw4/testFileM11HW4.txt";

    public static void main(String[] args) throws IOException {

        File file = new File(FILEPATH);
        M11Utils fileUtils = new M11Utils(file);

        System.out.println(fileUtils.checkWord("slovo1"));
    }
}
