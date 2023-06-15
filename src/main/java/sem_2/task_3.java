//Напишите метод, который составит строку, состоящую из 100 повторений слова TEST и метод,
//который запишет эту строку в простой текстовый файл, обработайте исключения

package sem_2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class task_3 {
        public static void main(String[] args) {
            String testString = generateTestString(100);
            writeToFile("test.txt", testString);
        }

        public static String generateTestString(int n) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < n; i++) {
                sb.append("TEST ");
            }
            return sb.toString();
        }

        public static void writeToFile(String fileName, String content) {
            try {
                BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
                writer.write(content);
                writer.close();
                System.out.println("File written successfully!");
            } catch (IOException e) {
                System.err.println("Error writing to file: " + e.getMessage());
            }
        }

}
