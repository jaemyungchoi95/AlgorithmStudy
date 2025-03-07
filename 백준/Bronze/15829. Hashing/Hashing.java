import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int L = sc.nextInt();
		String[] arr = sc.next().split("");
		
		int sum = 0;
		
		for (int i = 0; i < L; i++) {
			sum += ((arr[i].hashCode()-96) * Math.pow(31, i));
		}
		
		System.out.println(sum);
		
		sc.close();
	}
}