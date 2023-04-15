package seminar3.homework3;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Test004 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите данные через пробел в следующем порядке:" +
                "Фамилия Имя Отчество(латинницей) Дата рождения (в формате dd.MM.yyyy)" +
                "Номер телефона(цифрами) Пол (m - мужской, f - женский)");

        String lastName;
        String firstName;
        String middleName;
        LocalDate birthDate;
        long phoneNumber;
        char gender;

        String input = scanner.nextLine();

        try {
            String[] data = input.split("\\s+");
            if (data.length != 6) {
                throw new IllegalArgumentException("Неверное количество параметров");
            }

            lastName = data[0];
            firstName = data[1];
            middleName = data[2];

            if (!isValidDate(data[3])) {
                throw new IllegalArgumentException("Неверный формат даты рождения." +
                        "Используйте формат dd.MM.yyyy");
            }

            DateTimeFormatter formatter = DateTimeFormatter
                    .ofPattern("dd.MM.yyyy");
            birthDate = LocalDate.parse(data[3], formatter);

            if (!isValidPhoneNumber(data[4])) {
                throw new IllegalArgumentException("Неверный формат номера телефона." +
                        "Используйте только цифры");
            }

            phoneNumber = Long.parseLong(data[4]);
            if (data[5].equalsIgnoreCase("m")) {
                gender = 'm';
            } else if (data[5].equalsIgnoreCase("f")) {
                gender = 'f';
            } else {
                throw new IllegalArgumentException("Неверный формат пола." +
                        "Используйте 'm' или 'f'");
            }

        } catch (IllegalArgumentException e) {
            System.err.println("Ошибка: " + e.getMessage());
            return;
        }

        String fileName = lastName + ".txt";
        File file = new File(fileName);

        try (FileWriter writer = new FileWriter(file, true)) {
            DateTimeFormatter formatter = DateTimeFormatter
                    .ofPattern("dd.MM.yyyy");
            String output = String.format("%s %s %s %s %d %c%n", lastName,
                    firstName, middleName, birthDate.format(formatter),
                    phoneNumber, gender);
            writer.write(output);
            System.out.println("Данные сохранены в файл " + fileName);
        } catch (IOException e) {
            System.err.println("Ошибка записи в файл: " + e.getMessage());
            e.printStackTrace();
        }
    }

    private static boolean isValidDate(String date) {
        try {
            DateTimeFormatter formatter = DateTimeFormatter
                    .ofPattern("dd.MM.yyyy",
                            Locale.getDefault());
            LocalDate.parse(date, formatter);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    private static boolean isValidPhoneNumber(String phoneNumber) {
        return phoneNumber.matches("\\d+");
    }
}