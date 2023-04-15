package seminar3.homework3.itog;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class UserData {
    private String lastName;
    private String firstName;
    private String middleName;
    private LocalDate birthDate;
    private long phoneNumber;
    private char gender;

    public UserData(String lastName, String firstName, String middleName,
            LocalDate birthDate, long phoneNumber, char gender) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
        this.birthDate = birthDate;
        this.phoneNumber = phoneNumber;
        this.gender = gender;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public char getGender() {
        return gender;
    }

    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        return String.format("%s %s %s %s %d %c%n", lastName,
                firstName, middleName, birthDate.format(formatter),
                phoneNumber, gender);
    }
}