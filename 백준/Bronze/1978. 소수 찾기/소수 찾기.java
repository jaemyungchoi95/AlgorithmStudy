import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // 정수의 개수 N
		int cnt = 0;
		
		for (int i = 0; i < N; i++) {
			int num = sc.nextInt();
			if (num < 2) continue;
			int tmp = 0;
			for (int j = 2; j <= num; j++) {
				if (num%j == 0) {
					tmp++;
				}
			}
			if (tmp == 1) {
				cnt++;
			}
			
		}
		
		System.out.println(cnt);
		sc.close();
	} 
}