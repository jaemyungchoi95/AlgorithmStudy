import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> alist = new ArrayList<>();
		
		for (int i = 0; i < 10; i++) {
			int num = sc.nextInt()%42;
			if (!alist.contains(num)) {
				alist.add(num);
			}
		}
		
		System.out.println(alist.size());
		
	}
}