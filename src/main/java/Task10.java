import java.util.Scanner;

/**
 * Произведите ввод данных с клавиатуры в матрицу, а после этого произведите вывод первой строки матрицы на экран,
 * где каждый элемент умножается на 3. Размерность матрицы задается пользователем.
 */
public class Task10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Укажите размерность матрицы.\nВведите количество строк:");
        int a = in.nextInt();
        System.out.println("Введите количество столбцов");
        int b = in.nextInt();
        int array[][] = new int[a][b];

        System.out.println("Введите данные матрицы");
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                array[i][j] = in.nextInt();
            }
        }

        System.out.println("Вывод массива введеных значений умноженных на 2");
        for (int j = 0; j < b; j++) {
            System.out.print(3 * array[0][j] + " ");
        }
    }
}
