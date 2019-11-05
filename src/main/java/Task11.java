import java.util.Scanner;

/**
 * Необходимо произвести ввод строки с клавиатуры и записать в строковую переменную. Результат вывести на экран.
 */
public class Task11 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите строку:");
        String str = in.nextLine();

        System.out.println(str);
    }
}