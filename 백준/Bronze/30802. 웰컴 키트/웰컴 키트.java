import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // 참가자의 수 N
		int[] arr = new int[6]; // 사이즈별 티셔츠 신청수를 담아줄 정수 배열
		
		for (int i = 0; i < 6; i++) {
			arr[i] = sc.nextInt();
		}
		
		int T = sc.nextInt(); // 티셔츠의 묶음 구매 가능 수
		int P = sc.nextInt(); // 펜의 묶음 구매 가능 수
		
		int cnt = 0; // 티셔츠 묶음 수를 카운트해준다
		
		for (int i : arr) {
			if (i <= T && i > 0) {
				cnt += 1;
			} else if (i > T) {
				if (i%T > 0) {
					cnt += (i/T)+1;
				} else {
					cnt += i/T;
				}
			}
		}
		
		// 티셔츠를 T장씩 최소 몇묶음 주문해야 하는지
		System.out.printf("%d\n", cnt);
		// 펜의 묶음 주문수와 낱개 주문 수
		System.out.printf("%d %d\n", N/P, N%P);
		sc.close();
	}
}