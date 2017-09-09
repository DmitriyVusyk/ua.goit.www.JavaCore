package module11.hw3;

import module11.M11Utils;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * Создать метод, который заменяет слова в файле (File), и вывести результат в существующий контент файла.
 * File fileContentMerger(Map<String, String> map)
 */

class Main {
    private static final String FILEPATH = "/Users/dmytrovusyk/IdeaProjects/GoIT_Group9/vusyk_dmitriy/src/module11/hw3/testFileM11HW3.txt";

    public static void main(String[] args) throws IOException {

        File file = new File(FILEPATH);
        Map<String, String> keyWordsMap = new HashMap<>();
        M11Utils fileUtils = new M11Utils(file);


        keyWordsMap.put("slovo1", "alternative1");
        keyWordsMap.put("slovo2", "alternative2");

        System.out.println(fileUtils.fileContentMerger(keyWordsMap));
    }
}
