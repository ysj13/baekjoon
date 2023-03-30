import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        String str = sc.nextLine();
        String word = sc.nextLine();
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            sb.append(str.charAt(i));
            if (sb.toString().contains(word)) {
                count++;
                sb.setLength(0);
            }
        }

        System.out.println(count);

    }
}
