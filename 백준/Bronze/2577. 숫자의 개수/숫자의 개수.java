import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		
		String[] str = Integer.toString(A*B*C).split("");
		int[] arr = new int[10];
		
		for (String nums : str) {
			arr[Integer.parseInt(nums)]++;
		}
		
		for (int i : arr) System.out.println(i);
		sc.close();
	}
}