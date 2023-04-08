package homework.homework1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
/*
 * Реализуйте 3 метода, чтобы в каждом из них получить разные исключения
 */

public class Three_methods {

    // Пример 1: Генерация исключения IllegalArgumentException
    public static int divideNumbers(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Divisor can't be zero");
        }
        return a / b;
    }

    // Пример 2: Генерация исключения FileNotFoundException
    public static String readFile(String filePath) {
        String contents = "";
        try {
            File file = new File(filePath);
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                contents += scanner.nextLine();
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + filePath);
            contents = null;
        }
        return contents;
    }

    // Пример 3: Генерация исключения NullPointerException
    public static String concatenateStrings(String[] stringArray) {
        String concatenated = "";
        for (String s : stringArray) {
            concatenated += s;
        }
        if (concatenated.length() == 0) {
            throw new NullPointerException("Array must not be empty");
        }
        return concatenated;
    }
}