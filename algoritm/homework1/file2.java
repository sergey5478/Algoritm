package homework1;
import java.util.Arrays;

public class file2 {
    public static void main(String[] args) {
        int[] arr = { 4, 2, 9, 6, 23, 12, 34, 0, 1 };
        heapSort(arr);
        System.out.println((Arrays.toString(arr)));
    }

    public static void heapSort(int[] arr) {
        // Строим начальную пирамиду
        buildHeap(arr);

        // Размер кучи
        int size = arr.length - 1;

        // Просеиваем элементы пирамиды
        for (int i = size; i > 0; i--) {
            // Перемещаем корень пирамиды в конец
            swap(arr, 0, i);

            // Уменьшаем размер кучи
            size--;

            // Восстанавливаем свойства пирамиды
            heapify(arr, 0, size);
        }
    }

    // Метод для восстановления свойств пирамиды
    private static void heapify(int[] arr, int i, int size) {
        int leftChild = 2 * i + 1;
        int rightChild = 2 * i + 2;
        int largest = i;

        // Находим наибольший элемент среди i, leftChild и rightChild
        if (leftChild <= size && arr[leftChild] > arr[largest])
            largest = leftChild;
        if (rightChild <= size && arr[rightChild] > arr[largest])
            largest = rightChild;

        // Если наибольший элемент не i, то меняем их местами и рекурсивно вызываем
        // heapify
        if (largest != i) {
            swap(arr, i, largest);
            heapify(arr, largest, size);
        }
    }

    // Метод для построения начальной пирамиды
    private static void buildHeap(int[] arr) {
        int size = arr.length - 1;

        // Начинаем с середины массива, потому что у листьев нет детей
        for (int i = size / 2; i >= 0; i--) {
            heapify(arr, i, size);
        }
    }

    // Метод для обмена элементами
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
