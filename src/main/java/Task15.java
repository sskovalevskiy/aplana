import java.sql.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 * Написать программу сортировки по возрастанию заданного пользователем массива чисел.
 * Использовать пузырьковый метод сортировки.
 */
public class Task15 {
    public static void main(String[] args) {

        System.out.println("Введите числа через пробел");
        Scanner in = new Scanner(System.in);

        String array[] = in.nextLine().split(" ");

        int numbers[] = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            numbers[i] = Integer.parseInt(array[i]);
        }

        numbers = insertIntoSort(numbers);
        System.out.println("Массив чисел после сортировки: " + Arrays.toString(numbers));
    }

    public static int[] insertIntoSort(int[] arr) {
        int temp, j;
        for(int i = 0; i < arr.length - 1; i++){
            if (arr[i] > arr[i + 1]) {
                temp = arr[i + 1];
                arr[i + 1] = arr[i];
                j = i;
                while (j > 0 && temp < arr[j - 1]) {
                    arr[j] = arr[j - 1];
                    j--;
                }
                arr[j] = temp;
            }
        }
        return arr;
    }
}
