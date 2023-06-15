package sem_2;

public class task_2 {
    public static void main(String[] args) {
        String str = "aaabbbcccdde";
        StringBuilder sb = new StringBuilder();
        int count = 1;

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i - 1) == str.charAt(i)) {
                count++;
            } else {
                sb.append(str.charAt(i-1));
                sb.append(count);
                count = 1;
            }

            if (i == (str.length() - 1)) {
                sb.append(str.charAt(i));
                sb.append(count);
            }
        }
        System.out.println(sb);
    }
}
