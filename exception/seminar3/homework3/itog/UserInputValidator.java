package seminar3.homework3.itog;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class UserInputValidator {
    public static void validate(String input) throws IllegalArgumentException {
        String[] data = input.split("\\s+");
        if (data.length != 6) {
            throw new IllegalArgumentException("Неверное количество параметров");
        }

        if (!isValidDate(data[3])) {
            throw new IllegalArgumentException("Неверный формат даты рождения." +
                    "Используйте формат dd.MM.yyyy");
        }

        if (!isValidPhoneNumber(data[4])) {
            throw new IllegalArgumentException("Неверный формат номера телефона." +
                    "Используйте только цифры");
        }

        if (!isValidGender(data[5])) {
            throw new IllegalArgumentException("Неверный формат пола." +
                    "Используйте 'm' или 'f'");
        }
    }

    private static boolean isValidDate(String date) {
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy",
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

    private static boolean isValidGender(String gender) {
        return gender.equalsIgnoreCase("m") || gender
                .equalsIgnoreCase("f");
    }
}
