/*1.Необходимо написать один из простых алгоритмов сортировки,
имеющий сложность O(n2).*/
package seminar2;

import java.util.Arrays;

public class task1 {
    public static void main(String[] args) {
        int[] array = { 2, 8, 3, 5, 9, 1, 7, 25, 12, 85 };
        bubbleSort(array);
        System.out.println((Arrays.toString(array)));
    }

    public static void bubbleSort(int[] array) {
        boolean sorted = false;
        int temp;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    sorted = false;
                }
            }
        }
    }

}