import java.util.Scanner;

/**
 * Написать программу, которая будет выполнять следующие действия:
 * 1. Ввод трех чисел с клавиатуры x, y, z
 * 2. Нахождение и вывод на экран среднего арифметического чисел x, y, z
 * 3. Деление среднего арифметического на 2 без остатка
 * 4. Если полученное число больше 3, то вывести на экран сообщение "Программа выполнена корректно"
 */

public class Task6 {
    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);

        System.out.println("Введите число X");
        int x = in.nextInt();

        System.out.println("Введите число Y");
        int y = in.nextInt();

        System.out.println("Введите число Z");
        int z = in.nextInt();

        double average = (x + y + z) / 3.0;
        System.out.printf("Среднее арифметическое чисел %d, %d и %d равно %.2f\n", x, y, z, average);

        if (average / 2 > 3) {
            System.out.println("Программа выполнена корректно");
        }
    }
}