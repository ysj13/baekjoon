import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int num = 1;
        for (int i = 1; i < 46; i++) {
            int count = i;

            while (count > 0) {
                list.add(num);
                count--;
            }

            num++;

        }

        int sum = 0;
        for (int i = a - 1; i < b; i++) {
            sum += list.get(i);
        }

        System.out.println(sum);

    }
}
