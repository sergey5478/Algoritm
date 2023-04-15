package seminar3.homework3.itog;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите данные через пробел в следующем порядке:" +
                "Фамилия Имя Отчество(латинницей) Дата рождения (в формате dd.MM.yyyy)" +
                "Номер телефона(цифрами) Пол (m - мужской, f - женский)");
        String input = scanner.nextLine();

        try {
            UserInputValidator.validate(input);

            String[] data = input.split("\\s+");
            String lastName = data[0];
            String firstName = data[1];
            String middleName = data[2];
            LocalDate birthDate = LocalDate.parse(data[3],
                    DateTimeFormatter.ofPattern("dd.MM.yyyy"));
            long phoneNumber = Long.parseLong(data[4]);
            char gender = data[5].charAt(0);

            UserData userData = new UserData(lastName, firstName, middleName,
                    birthDate, phoneNumber, gender);

            UserDataFileManager.saveUserDataToFile(userData);
        } catch (IllegalArgumentException e) {
            System.err.println("Ошибка ввода данных: " + e.getMessage());
        }
        scanner.close();
    }
}