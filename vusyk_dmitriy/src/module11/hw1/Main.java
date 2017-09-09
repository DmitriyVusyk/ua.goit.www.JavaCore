package module11.hw1;

import module11.M11Utils;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;


/**
 * Создать метод, который заменяет слова в файле (File) и возвращает строку (String) с заменёнными значениями.
 * <p>
 * String replacer(Map map)
 * <p>
 * Создать метод, который заменяет слова в файле (File) и возвращает строку (String) с заменёнными значениями.
 * <p>
 * String replacer(Map map)
 */
class Main {

    private static final String FILEPATH = "/Users/dmytrovusyk/IdeaProjects/GoIT_Group9/vusyk_dmitriy/src/module11/hw1/testFileM11HW1.txt";

    public static void main(String[] args) throws IOException {

        File file = new File(FILEPATH);
        Map<String, String> keyWordsMap = new HashMap<>();
        M11Utils fileUtils = new M11Utils(file);

        keyWordsMap.put("slovo1", "alternative1");
        keyWordsMap.put("slovo2", "alternative2");


        System.out.println(fileUtils.replacer(keyWordsMap));
    }

}
