import java.util.Scanner;

/**
 * Необходимо вывести на экран таблицу умножения от 1 до 10 для введённого пользователем любого числа.
 * Использовать циклы запрещено.
 */
public class Task5 {
    public static void main(String[] args) {

        System.out.println("Введите число");
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        int i = 0;
        System.out.printf("Таблица умножения для числа %d \n", number);
        System.out.printf("%d * %2d = %d\n", number, ++i, number*i);
        System.out.printf("%d * %2d = %d\n", number, ++i, number*i);
        System.out.printf("%d * %2d = %d\n", number, ++i, number*i);
        System.out.printf("%d * %2d = %d\n", number, ++i, number*i);
        System.out.printf("%d * %2d = %d\n", number, ++i, number*i);
        System.out.printf("%d * %2d = %d\n", number, ++i, number*i);
        System.out.printf("%d * %2d = %d\n", number, ++i, number*i);
        System.out.printf("%d * %2d = %d\n", number, ++i, number*i);
        System.out.printf("%d * %2d = %d\n", number, ++i, number*i);
        System.out.printf("%d * %2d = %d\n", number, ++i, number*i);
    }
}
