import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();

        int[] arr = new int[N];
        List<Integer> list = new ArrayList<>();

        for(int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        int sum = 0;
        for(int i = 0; i < K; i++) {
            sum += arr[i];
        }

        list.add(sum);

        for(int i = K; i < N; i++) {
            sum += (arr[i] - arr[i - K]);
            list.add(sum);
        }

        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list.get(0));

    }
}
