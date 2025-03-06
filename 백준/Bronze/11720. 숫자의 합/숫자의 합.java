import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String[] nums = sc.next().split("");
		int sum = 0;
		
		for (String str : nums) {
			if (Integer.parseInt(str) > 0) {
				sum += Integer.parseInt(str);
			}
		}
		
		System.out.println(sum);
		
	}
}