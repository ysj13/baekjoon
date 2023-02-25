import java.util.*;

public class Main {
	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);
		List<String> list = new ArrayList<>();
		String[] arr = {"D", "C", "B", "A", "E"};
		
		for(int i = 0; i < 3; i++) {
			String temp = "";
			for(int j = 0; j < 4; j++) {
				String str = Integer.toString(sc.nextInt());
				temp += str;
			}
			list.add(temp);
		}

		for(int i = 0; i < 3; i++) {
			int count = 0;
			for(int j = 0; j < 4; j++) {
				if(list.get(i).charAt(j) == '1') {
					count++;
				}
			}
			System.out.println(arr[count]);
		}
	}
}