import java.util.Scanner;

/**
 * Напишите программу конвертер валют. Программа должна переводить рубли в доллары по текущему курсу.
 * Пользователь вводит текущий курс и количество рублей. Итоговое значение должно быть округлено до двух знаков после запятой.
 * Пример для теста работы программы: Курс доллара = 67,55, Количество рублей: 1000, Итого: 14,80 долларов)
 */
public class FinalTask3 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Введите текущий курс доллара:");
        double exchangeRate = Double.parseDouble(in.nextLine());

        System.out.println("Введите количество рублей:");
        int rubles = Integer.parseInt(in.nextLine());

        System.out.printf("Курс доллара = %.2f, Количество рублей: %d, Итого: %.2f долларов", exchangeRate, rubles, rubles/exchangeRate);
    }
}
