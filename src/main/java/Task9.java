import java.util.Scanner;

/**
 * Произведите ввод данных с клавиатуры в массив, а после этого произведите вывод массива на экран,
 * где каждый элемент массива умножается на 2. Размер массива задается пользователем.
 */
public class Task9 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Укажите размерность массива:");
        int a = in.nextInt();
        int array[] = new int[a];

        System.out.println("Введите данные массива");
        for (int i = 0; i < a; i++) {
            array[i] = in.nextInt();
        }

        System.out.println("Вывод массива введеных значений умноженных на 2:");
        for (int i = 0; i < a; i++) {
            System.out.print(array[i]*2 + " ");
        }
    }
}
