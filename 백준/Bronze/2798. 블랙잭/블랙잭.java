import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // 카드의 개수 N
		int M = sc.nextInt(); // 카드의 제한 합계 M
		
		int[] arr = new int[N];
		
		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}
		
		int max = 0;
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (i == j) continue;
				for (int k = 0; k < N; k++) {
					if (i == k || j == k) continue;
					int subtotal = arr[i] + arr[j] + arr[k];
					if (subtotal > M) continue;
					if (subtotal <= M && subtotal > max) {
						max = subtotal;
					}
				} // for k
			} // for j
		} // for i
		
		System.out.println(max);
		
		sc.close();
	}
}