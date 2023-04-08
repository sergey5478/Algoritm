package seminarEX.homework1;

import java.util.Arrays;

/*
 *  Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, 
 * и возвращающий новый массив, каждый элемент которого равен частному элементов 
 * двух входящих массивов в той же ячейке. Если длины массивов не равны, необходимо 
 * как-то оповестить пользователя. Важно: При выполнении метода единственное исключение, 
 * которое пользователь может увидеть - RuntimeException, т.е. ваше.
 */
public class Two_arrays_division {
    public static void main(String[] args) {
        int[] arr1 = { 10, 20, 30 };
        int[] arr2 = { 2, 4, 6 };
        try {
            int[] result = divideArrays(arr1, arr2);
            System.out.println(Arrays.toString(result));
        } catch (RuntimeException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    public static int[] divideArrays(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            throw new RuntimeException("Массивы разной длинны!");
        }

        int[] result = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            result[i] = arr1[i] / arr2[i];
        }
        return result;
    }
}
