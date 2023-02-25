import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H, M = 0;

        H = sc.nextInt();
        M = sc.nextInt();

        // 입력받는 분이 45보다 작으면 시를 -1 해준다
        // 그다음 60 + (분 - 45) 를 한다
        // 45보다크면 그냥 분을 빼줌
        // 시간이 -1이면 = 23으로
        if (M < 45) {
            H = H - 1;
            M = 60 + (M - 45);

            if (H < 0) {
                H = 23;
            }

        } else {
            M = M - 45;
        }

        System.out.println(H + " " + M);

    }
}
