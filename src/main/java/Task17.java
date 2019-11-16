import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Необходимо написать программу, которая будет записывать текстовые данные, введенные с экрана, в файл .txt.
 * Запись ввести в файл до тех пор, пока не будет введена команда стоп в консоли.
 * Пользователь при тестировании программы по правилу черного ящика должен понимать, какой принцип остановки записи
 * в файл он должен подать.
 */

public class Task17 {
    public static void main(String[] args) {
        System.out.println("Введите текстовые данные. Для завершения введите стоп");
        Scanner in = new Scanner(System.in);

        String str = null;

        try (FileWriter writer = new FileWriter("./notes_new.txt", true)) {
            while (!"стоп".equals(str)) {
                str = in.nextLine();
                writer.write(str);
            }
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

    }
}
