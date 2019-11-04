import java.util.Scanner;

/**
 * Ввести с консоли число в бинарном формате. Перевести его в десятичный формат, записать в переменную int и вывести на экран.
 */
public class Task4 {
    public static void main(String[] args) {

        System.out.println("Введите число в бинарном виде");
        Scanner in = new Scanner(System.in);
        String num = in.nextLine();
        try {
            int number = Integer.parseInt(num, 2);
            System.out.println(number);
        }catch (NumberFormatException ex){
            System.out.printf("Введенная строка %s не соотвествует бинарному виду. Допустимые символы 1 и 0.", num);
        }
    }
}
