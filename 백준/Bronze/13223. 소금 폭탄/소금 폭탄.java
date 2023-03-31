import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();

        String[] now = str1.split(":");
        String[] drop = str2.split(":");

        int time_h = Integer.parseInt(drop[0]) - Integer.parseInt(now[0]);
        int time_m = Integer.parseInt(drop[1]) - Integer.parseInt(now[1]);
        int time_s = Integer.parseInt(drop[2]) - Integer.parseInt(now[2]);

        if (time_s < 0) {
            time_s += 60;
            time_m--;
        }

        if (time_m < 0) {
            time_m += 60;
            time_h--;
        }

        if (time_h <= 0) {
            time_h += 24;
        }

        String answer = "";

        if (time_h < 10) {
            answer += "0" + time_h + ":";
        } else {
            answer += time_h + ":";
        }

        if (time_m < 10) {
            answer += "0" + time_m + ":";
        } else {
            answer += time_m + ":";
        }

        if (time_s < 10) {
            answer += "0" + time_s;
        } else {
            answer += time_s;
        }

        System.out.println(answer);

    }
}
