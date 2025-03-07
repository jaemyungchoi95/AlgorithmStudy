import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // 오늘의 날짜
		int M = sc.nextInt(); // 2주 전 오늘의 날짜
		
		if (N > 7) {
			System.out.println(N-7);
		} else {
			System.out.println(M+7);
		}
		
		sc.close();
	}
}