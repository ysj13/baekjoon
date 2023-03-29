import java.util.Scanner;

public class Main {
	public static void main(String[] args) {	
		Scanner sc = new Scanner(System.in);
		String str = sc.next().toUpperCase();
		
		int[] alphaCount = new int[26];
		
		for(int i = 0; i < str.length(); i++) {
			alphaCount[str.charAt(i) - 'A']++;
		}
		
		// 배열에서 가장 큰 수 찾기
		int maxCount = 0;
		char maxAlphabet = '?';
		
		for(int i = 0; i < 26; i++) {
			if(alphaCount[i] > maxCount) {
				maxCount = alphaCount[i];
				maxAlphabet = (char)('A' + i);
			} else if(alphaCount[i] == maxCount) {
				maxAlphabet = '?';
			}
		}
		System.out.println(maxAlphabet);
	}
}
