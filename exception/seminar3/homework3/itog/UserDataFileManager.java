package seminar3.homework3.itog;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class UserDataFileManager {
    private static final String FILE_EXTENSION = ".txt";

    public static void saveUserDataToFile(UserData userData) {
        String fileName = userData.getLastName() + FILE_EXTENSION;
        File file = new File(fileName);

        try (FileWriter writer = new FileWriter(file, true)) {
            writer.write(userData.toString());
            System.out.println("Данные сохранены в файл " + fileName);
        } catch (IOException e) {
            System.err.println("Ошибка записи в файл: " + e.getMessage());
            e.printStackTrace();
        }
    }
}