package seminar2.homework2;
/*
 * Задание2
 * Добавил если.
 */
public class Task2 {
    public static void main(String[] args) {
        int[] intArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        try {
            int d = 1;
            double catchedRes1 = 0; 
            if (d != 0) {
                catchedRes1 = intArray[8] / d;
            }
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Catching exception: " + e);
        }
    }
}
