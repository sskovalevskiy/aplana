import java.util.Scanner;

/**
 * Для введенной с клавиатуры строки необходимо провести отсев пробелов.
 * Результат в виде строки без пробелов вывести на экран.
 */
public class Task12 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите строку:");
        String str = in.nextLine();
        str = str.replaceAll(" ", "");
        System.out.println(str);
    }
}
