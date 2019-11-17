import java.util.Scanner;

/**
 * Ввести с консоли число в бинарном формате. Перевести его в десятичный формат, записать в переменную int и вывести на экран.
 * Необходимо использовать циклы, нельзя использования готовые методы языка Java, для перевода числа из одной системы
 * счисления в другую.
 */

public class FinalTask1 {
    public static void main(String[] args) {
        {
            System.out.println("Введите число в бинарном виде");
            Scanner in = new Scanner(System.in);
            String num = in.nextLine();

            if (num.length() >= 32){
                System.out.println("Ваше число превышает допустимый размер для Integer");
            }
            int result = 0;
            for (int i = 0; i < num.length() && i < 32; i++) {
                if (num.charAt(num.length() -1 - i) == '1'){
                    result += Math.pow(2, i);
                }
            }

            System.out.println("Результат в десятичной системе счисления: " + result);

        }
    }
}
