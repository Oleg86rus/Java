//Реализуйте алгоритм сортировки пузырьком числового массива,
// результат после каждой итерации запишите в лог-файл.

package hw_2;

import java.io.FileWriter;
import java.io.IOException;

public class task_2 {
    public static void main(String[] args) {
        int[] arr = {6, 5, 4, 3, 2, 1};
        int n = arr.length;

        try {
            FileWriter writer = new FileWriter("log.txt");
            writer.write("Исходный массив: ");
            for (int i = 0; i < n; i++) {
                writer.write(arr[i] + " ");
            }
            writer.write("\n");

            for (int i = 0; i < n - 1; i++) {
                for (int j = 0; j < n - i - 1; j++) {
                    if (arr[j] > arr[j + 1]) {
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                }
                writer.write("После " + (i + 1) + "-й итерации: ");
                for (int k = 0; k < n; k++) {
                    writer.write(arr[k] + " ");
                }
                writer.write("\n");
            }
            writer.close();
        } catch (IOException e) {
            System.out.println("Ошибка записи в файл.");
            e.printStackTrace();
        }

    }
}
