package seminar2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Запишите в файл следующие строки:
 * Анна=4 Елена=5 Марина=6 Владимир=? Константин=? Иван=4
 * Реализуйте метод, который считывает данные из файла и сохраняет в двумерный
 * массив
 * (либо HashMap, если студенты с ним знакомы). В отдельном методе нужно будет
 * пройти по структуре данных, если сохранено значение ?, заменить его на
 * соответствующее число.
 * Если на каком-то месте встречается символ, отличный от числа или ?, бросить
 * подходящее исключение.Записать в тот же файл данные с замененными символами ?.
 */
public class Program1 {

    public static void main(String[] args) {
        String path = "C:\\AAA\\Git репозитории\\Algoritm\\exception\\seminar2\\name.txt";
        writeFile(path, readFile(path));
    }

    public static HashMap<String, Integer> readFile(String path) {
        HashMap<String, Integer> list = new HashMap<>();
        try (Scanner scanner = new Scanner(new File(path))) {
            Integer num = null;
            while (scanner.hasNext()) {
                String[] lines = scanner.next().split("=");
                if (!lines[1].equals("?")) {
                    num = Integer.parseInt(lines[1]);
                    list.put(lines[0], num);
                } else {
                    if (num == null) {
                        num = 1;
                    } else {
                        num++;
                        list.put(lines[0], num);
                    }
                }
            }
        } catch (IOException ex) {
            System.out.println("Исключение ввода-вывода");
        } catch (NumberFormatException ex) {
            System.out.println("Не удалось считать значение");
        }
        return list;
    }

    public static void writeFile(String path, HashMap<String, Integer> lines) {
        try (FileWriter fileWriter = new FileWriter(path)) {
            for (Map.Entry<String, Integer> ent : lines.entrySet()) {
                fileWriter.write(ent.getKey() + "=" + ent.getValue() + "\n");
            }
        } catch (IOException ex) {
            System.out.println("Ошибка ввода-вывода");
        }
    }
}