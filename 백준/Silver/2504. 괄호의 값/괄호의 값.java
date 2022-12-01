import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        String[] arr = str.split("");

        System.out.println(괄호쌍찾기(arr));
    }

    static int 괄호쌍찾기(String[] arr) {
        int temp = 1;
        int answer = 0;
        Stack<String> stack = new Stack<>();

        // 짝이 안맞는 경우
        if (arr.length % 2 == 1) {
            return answer;
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals("(")) {
                temp *= 2;
                stack.push(arr[i]);
            } else if (arr[i].equals("[")) {
                temp *= 3;
                stack.push(arr[i]);
            } else if (arr[i].equals(")")) {
                if (stack.isEmpty() || !stack.peek().equals("(")) {
                    return answer = 0;
                }
                if (arr[i - 1].equals("(")) {
                    answer += temp;
                }
                stack.pop();
                temp /= 2;
            } else if (arr[i].equals("]")) {
                if (stack.isEmpty() || !stack.peek().equals("[")) {
                    return answer = 0;
                }
                if (arr[i - 1].equals("[")) {
                    answer += temp;
                }
                stack.pop();
                temp /= 3;
            }
        }

        return answer;
    }

}
