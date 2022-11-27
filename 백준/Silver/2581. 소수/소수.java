import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static List<Integer> list = new ArrayList<>();
    static int sum = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();

        int[] arr = new int[n - m + 1];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = m + i;
        }

        for (int i : arr) {
            소수찾기(i);
        }

        if (list.isEmpty()) {
            list.add(-1);
        } else {
            System.out.println(sum);
        }

        System.out.println(list.get(0));

    }

    static void 소수찾기(int n) {
        if (n == 1) {
            return;
        }

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return;
            }
        }

        list.add(n);
        sum += n;
    }
}
