import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String ku = "LoveisKoreaUniversity";
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < N; i++) {
			sb.append(ku).append(" ");
		}
		System.out.println(sb.toString().trim());
		sc.close();
	}
}