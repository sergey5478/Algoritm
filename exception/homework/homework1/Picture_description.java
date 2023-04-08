package homework.homework1;

/**
 * Посмотрите на код, и подумайте сколько разных типов
 * исключений вы тут сможете получить?
 */
public class Picture_description {

    public static void main(String[] args) {
        // Примеры входных данных
        // String[][] arr1 = { { "S", "2", "3", "4", "5" }, { "6", "7", "8", "9", "10" } };
        //Ошибка: неверный формат числа. Сумма элементов массива arr1 равна: 0
        
        // String[][] arr1 = { {  }, {  } };
        //Ошибка: индекс вне границ массива. Сумма элементов массива arr1 равна: 0
        
        String[][] arr1 = { { "1", "2", "3", "4", "5" }, { "6", "7", "8", "9", "10" } };

        // Проверка функции на входных данных arr1
        int sum1 = sum2d(arr1);
        System.out.println("Сумма элементов массива arr1 равна: " + sum1);
        // Ожидаемый результат: 55        
    }

    public static int sum2d(String[][] arr) {
        int sum = 0;
        try {
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < 5; j++) {
                    int val = Integer.parseInt(arr[i][j]);
                    sum += val;
                }
            }
        } catch (NumberFormatException e) {
            // обработка исключения NumberFormatException
            System.out.println("Ошибка: неверный формат числа.");
        } catch (ArrayIndexOutOfBoundsException e) {
            // обработка исключения ArrayIndexOutOfBoundsException
            System.out.println("Ошибка: индекс вне границ массива.");
        } catch (NullPointerException e) {
            // обработка исключения NullPointerException
            System.out.println("Ошибка: ссылка на null-объект.");
        }
        return sum;
    }
}