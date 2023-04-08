package seminar2;
/*1.Написать алгоритм быстрого поиска (quicksort). */
public class task2 {
    public static void main(String[] args) {
        int[] arr = new int[] { 2, 5, 3, 7, 4, 8, 6, 9, 1, 0 };
        quikSort(arr, 0, arr.length - 1);
        for (int i = 0; i <= arr.length - 1; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void quikSort(int[] array, int startPosition, int endPosition) {
        int leftposition = startPosition;
        int rightPosition = endPosition;
        int pivot = array[(endPosition + startPosition) / 2];
        do {
            while (array[leftposition] < pivot) {
                leftposition++;
            }
            while (array[rightPosition] > pivot) {
                rightPosition--;
            }
            if (leftposition <= rightPosition) {
                if (leftposition < rightPosition) {
                    int temp = array[leftposition];
                    array[leftposition] = array[rightPosition];
                    array[rightPosition] = temp;
                }
                leftposition++;
                rightPosition--;
            }
        } while (leftposition <= rightPosition);
        if (leftposition < endPosition) {
            quikSort(array, leftposition, endPosition);
        }
        if (startPosition < rightPosition) {
            quikSort(array, startPosition, rightPosition);
        }
    }
}
