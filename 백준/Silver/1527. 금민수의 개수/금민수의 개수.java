import java.util.Scanner;

public class Main {
    static long a, b, count;

    public static void solution(long num) {
        if (num > b) {
            return;
        }

        if (num >= a) {
            count += 1;
        }

        solution(num * 10 + 4);
        solution(num * 10 + 7);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        a = sc.nextInt();
        b = sc.nextInt();

        solution(4);
        solution(7);

        System.out.println(count);
    }
}
