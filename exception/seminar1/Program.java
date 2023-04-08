package seminar1;

/**
 * Program
 */
public class Program {
    static int arrayLenght(int[] array) {
        if (array.length < 2)
            return -1;
        return array.length;
    }

    public static void main(String[] args) {
        int[] array = {1,2,3};
        int length = arrayLenght(array);
        if(length<0)
            System.out.println("54321");
        else
            System.out.println("12345");
    }
}