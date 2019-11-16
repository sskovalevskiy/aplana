import java.io.*;
import java.nio.charset.StandardCharsets;

/**
 * Необходимо написать программу, которая будет выводить на экран текстовые данные из файла .txt
 */
public class Task16 {
    public static void main(String[] args) {

        try (BufferedReader reader = new BufferedReader(
                new InputStreamReader(
                        new FileInputStream("./notes.txt"), StandardCharsets.UTF_8))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
