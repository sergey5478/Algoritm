package seminar2;

public class task4 {
    public static void main(String[] args) {
    }

    public static int binarySearch(int[] array, int value, int minPos, int MaxPos) {
        if (minPos >= MaxPos) {
            return -1;
        }
        int midPoint = minPos + (MaxPos - minPos) / 2;
        if (array[midPoint] == value) {
            return midPoint;
        } else if (array[midPoint] > value) {
            return binarySearch(array, value, minPos, midPoint - 1);
        } else {
            return binarySearch(array, value, midPoint + 1, MaxPos);
        }
    }
}
