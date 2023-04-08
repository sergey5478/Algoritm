package seminarEX;

/**
 * Реализуйте метод, принимающий в качестве аргумента целочисленный массив и
 * некоторое
 * значение. Метод ищет в массиве заданное значение и возвращает его индекс. При
 * этом,
 * например:если длина массива меньше некоторого заданного минимума, метод
 * возвращает -1,
 * в качестве кода ошибки.если искомый элемент не найден, метод вернет -2 в
 * качестве кода
 * ошибки.если вместо массива пришел null, метод вернет -3 придумайте свои
 * варианты
 * исключительных ситуаций и верните соответствующие коды ошибок. Напишите
 * метод, в котором
 * реализуйте взаимодействие с пользователем. То есть, этот метод запросит
 * искомое число у
 * пользователя, вызовет первый, обработает возвращенное значение и покажет
 * читаемый результат
 * пользователю. Например, если вернулся -2, пользователю выведется сообщение:
 * “Искомый
 * элемент не найден”.
 */
public class Program2 {
    private static final int MINSIZE = 5;

    public static void main(String[] args) {

    }
    public static int findElement(int[] array, int value) {
        if (array == null) {
            return -3;
        }
        if (array.length < MINSIZE) {
            return -1;
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -2;
    }

    public static void userInterface(int answer) {
        switch (answer) {
            case -1 -> System.out.println("Длинна массива меньше " + MINSIZE);
            case -2 -> System.out.println("Искомый элемент не найден");
            case -3 -> System.out.println("Массива не существует");
            default -> System.out.println("Индекс искомого элемента равен " + answer);
        }
    }
}