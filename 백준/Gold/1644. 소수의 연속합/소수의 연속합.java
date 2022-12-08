import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static List<Integer> list = new ArrayList<>();
    static int[] nums;
    static int N;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();

        nums = new int[N + 1];

        for (int i = 2; i < nums.length; i++) {
            nums[i] = i;
        }

        // 소수찾기
        isPrime(N);

        // 투포인터 탐색 시작
        int sum = 0;
        int lt = 0;
        int count = 0;
        for (int rt = 0; rt < list.size(); rt++) {
            sum += list.get(rt);

            if (sum == N) {
                count++;
            }

            while (sum >= N) {
                sum -= list.get(lt++);

                if (sum == N) {
                    count++;
                }
            }
        }

        System.out.println(count);

    }

    static void isPrime(int n) {
        for(int i = 2; i <= n; i++) {
            if (nums[i] == 0) {
                continue;
            }

            for(int j = 2 * i; j <= n; j += i) {
                nums[j] = 0;
            }

            list.add(nums[i]);
        }

    }

}
