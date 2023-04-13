package seminar2.homework2;
/*
 * Реализуйте метод, который запрашивает у пользователя ввод дробного числа 
 * (типа float), и возвращает введенное значение. Ввод текста вместо числа не должно 
 * приводить к падению приложения, вместо этого, необходимо повторно запросить 
 * у пользователя ввод данных.
 */
import java.util.Scanner;

public class Fractional_numbers {
    public static void main(String[] args) {
        float floatValue = getFloatInputFromUser();
        System.out.println("You entered: " + floatValue);

    }
    
    private static float getFloatInputFromUser() {
        Scanner scanner = new Scanner(System.in);
        float floatValue;
        
        while (true) {
            System.out.println("Please enter a floating point number: ");
            try {
                floatValue = Float.parseFloat(scanner.nextLine());
                scanner.close();
                break;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please try again.");
            }
        }

        return floatValue;
        
    }
}
