//Дано четное число N (>0) и символы с1 и с2
//Написать метод, который вернет строку длинны N,
//которая состоит из чередующихся символов с1 и с2, начиная с с1

package sem_2;

public class task_1 {
    public static void main(String[] args) {
        int n = 7;
        String c1 = "A";
        String c2 = "B";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                sb.append(c1);
            } else {
                sb.append(c2);
            }
        }
        System.out.println(sb);
    }
}
