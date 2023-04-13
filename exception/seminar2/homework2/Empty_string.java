package seminar2.homework2;

import java.util.Scanner;

/*
 * Разработайте программу, которая выбросит Exception, когда пользователь вводит 
 * пустую строку. Пользователю должно показаться сообщение, что пустые строки 
 * вводить нельзя
 */
public class Empty_string {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String input = scanner.nextLine();
        
        if (input.isEmpty()) {
            throw new Exception("Нельзя вводить пустые строки");
        }
        
        System.out.println("Вы ввели: " + input);
    }
}
