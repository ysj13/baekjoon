import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		String str = sc.next();
		
		for(char c : str.toCharArray()) {
			if(c >= 97 && c <= 122) {
				sb.append(Character.toString(c).toUpperCase());
			} else if(c >= 65 && c <= 90) {
				sb.append(Character.toString(c).toLowerCase());
			}
		}
		
		System.out.println(sb);
	}
}
