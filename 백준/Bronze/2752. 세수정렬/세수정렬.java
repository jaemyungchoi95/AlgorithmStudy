import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[3];
		
		for (int i = 0; i < 3; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		
		StringBuilder sb = new StringBuilder();
		for (int i : arr) sb.append(i + " ");
		
		System.out.println(sb.toString().trim());
		
		sc.close();
	}
}