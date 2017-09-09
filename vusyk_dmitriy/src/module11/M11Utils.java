package module11;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.*;
import java.util.*;


public class M11Utils {

    private File file;

    public M11Utils(File file) {
        this.file = file;
    }

    /**
     * Создать метод, который заменяет слова в файле (File) и возвращает строку (String) с заменёнными значениями.
     * <p>
     * String replacer(Map map)
     * <p>
     */
    public String replacer(Map<String, String> map) throws IOException {

        StringBuilder stringBuilder = new StringBuilder();
        Path path = Paths.get(this.file.getPath());

        Files.lines(path)
                .map(str -> str + "\r\n")
                .map(line -> {
                    final String[] stringArray = {line};
                    map.forEach((key, value) -> {
                        if (stringArray[0].contains(key)) {
                            stringArray[0] = stringArray[0].replaceAll(key, value);
                        }
                    });
                    return stringArray[0];
                })
                .forEach(stringBuilder::append);

        return stringBuilder.toString();
    }

    /**
     * Создать метод, который заменяет слова в файле (File) и переписать его содержание с новыми значениями.
     * File fileContentReplacer(Map map)
     */
    public Path fileContentReplacer(Map<String, String> map) throws IOException {

        String fileContent = replacer(map);
        Path path = Paths.get(this.file.getPath());
        Path tempFile = Files.createTempFile("tempFile", ".txt");

        try (FileWriter writer = new FileWriter(String.valueOf(tempFile), true)) {
            writer.write(fileContent);
        } catch (IOException e) {
            e.printStackTrace();
        }


        return Files.move(tempFile, path, StandardCopyOption.REPLACE_EXISTING);
    }

    /**
     * Создать метод, который заменяет слова в файле (File), и вывести результат в существующий контент файла.
     * File fileContentMerger(Map<String, String> map)
     */
    public Path fileContentMerger(Map<String, String> map) throws IOException {

        Path path = Paths.get(this.file.getPath());
        String fileContent = replacer(map);

        return Files.write(path, fileContent.getBytes(), StandardOpenOption.APPEND);
    }

    /**
     * Проверить, содержит ли файл конкретное слово. Вывести 0, если нет.
     * Вывести номер n, который эквивалентен числу появлений этого слова в файле.
     * int checkWord(String word)
     * Написать это задание с обычным try и try-with-resources(две версии).
     */
    public int checkWord(String word) throws IOException {

        Path path = Paths.get(this.file.getPath());

        long count = Files.lines(path)
                .filter(string -> string.equals(word))
                .count();

        return (int) count;
    }
}
