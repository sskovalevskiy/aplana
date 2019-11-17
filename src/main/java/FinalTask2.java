import java.util.Arrays;
import java.util.Scanner;

/**
 * Написать программу сортировки по возрастанию заданного пользователем массива чисел. Пользователь программы должен
 * задавать размер массива и наполнять его числами. Использовать одну из следующих сортировок: прямого выбора, вставки,
 * быстрая, Шелла.
 */
public class FinalTask2 {
    public static void main(String[] args) {

        System.out.println("Введите числа через пробел");
        Scanner in = new Scanner(System.in);

        String array[] = in.nextLine().split(" ");

        int numbers[] = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            numbers[i] = Integer.parseInt(array[i]);
        }

        shellSort(numbers);
        System.out.println("Массив чисел после сортировки: " + Arrays.toString(numbers));
    }

    public static void shellSort(int[] array) {
        int h = 1;
        while (h*3 < array.length)
            h = h * 3 + 1;

        while(h >= 1) {
            hSort(array, h);
            h = h/3;
        }
    }

    private static void hSort(int[] array, int h) {
        int length = array.length;
        for (int i = h; i < length; i++) {
            for (int j = i; j >= h; j = j - h) {
                if (array[j] < array[j - h])
                    swap(array, j, j - h);
                else
                    break;
            }
        }
    }

    public static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
