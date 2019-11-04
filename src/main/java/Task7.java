import java.util.Scanner;

/**
 * Необходимо написать программу, где бы пользователю предлагалось ввести с клавиатуры число в переменную number.
 * В программе должны присутствовать константы X, Y, Z. Программа должна сравнивать введенное значение с клавиатуры
 * со значением констант и вывести на экран сообщение "Данное значение имеется в константах" если number=X или Y или Z.
 * Если переменная отличается от констант, нужно вывести оповещение "Такой константы нет!"
 */
public class Task7 {
    public static void main(String[] args) {
        int X = 7;
        int Y = 13;
        int Z = 666;

        Scanner in = new Scanner(System.in);
        System.out.println("Введите число");
        int number = in.nextInt();

        if (number == X || number == Y || number == Z) {
            System.out.println("Данное значение имеется в константах");
        } else {
            System.out.println("Такой константы нет!");
        }
    }
}
