import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		
		System.out.println(A+B-C);
		String AB = Integer.toString(A)+Integer.toString(B);
		System.out.println(Integer.parseInt(AB)-C);
		sc.close();
	}
}