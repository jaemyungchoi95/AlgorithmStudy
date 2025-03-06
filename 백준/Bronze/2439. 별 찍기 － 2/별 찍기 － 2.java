import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String[] arr = new String[N];
		Arrays.fill(arr, " ");
		
		for (int i = N-1; i >= 0; i--) {
			arr[i] = "*";
			StringBuilder sb = new StringBuilder();
			for (String str : arr) {
				sb.append(str);
			}
			System.out.println(sb);
		}
		sc.close();
	}
}