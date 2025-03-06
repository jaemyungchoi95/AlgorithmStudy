import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for (int test_case = 1; test_case <= T; test_case++) {
			String[] str = sc.next().split("");
			int subTotal = 0;
			int ans = 0;
			for (String s : str) {
				if (s.equals("O")) {
					subTotal++;
					ans += subTotal;
				} else if (s.equals("X")) {
					subTotal = 0;
				}
			}
			System.out.println(ans);
		}
		sc.close();
	}
}