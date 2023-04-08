package homework.homework1;

import java.util.Arrays;
/*
 * Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, 
 * и возвращающий новый массив, каждый элемент которого равен разности элементов 
 * двух входящих массивов в той же ячейке. Если длины массивов не равны, необходимо 
 * как-то оповестить пользователя.
 */
public class Two_arrays_subtraction {
    public static void main(String[] args) {
        int[] arr1 = { 1, 3, 5 };
        int[] arr2 = { 2, 4, 6 };

        try {
            int[] result = arrayDifference(arr1, arr2);
            System.out.println(Arrays.toString(result));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    public static int[] arrayDifference(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            // если длины массивов не равны, выбрасываем исключение
            throw new IllegalArgumentException("Длины массивов не совпадают");
        }

        int[] result = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            result[i] = arr1[i] - arr2[i];
        }
        return result;
    }
}
