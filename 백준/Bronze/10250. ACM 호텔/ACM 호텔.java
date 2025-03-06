import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for (int test_case = 1; test_case <= T; test_case++) {
			int H = sc.nextInt(); // 호텔의 높이
			int W = sc.nextInt(); // 층별 호실의 수
			int N = sc.nextInt(); // 손님의 번호
		
			ArrayList<String> alist = new ArrayList<>();
			
			for (int i = 1; i <= W; i++) {
				for (int j = 1; j <= H; j++) {
					if (N == 0) break;
					StringBuilder sb = new StringBuilder();
					sb.append(j);
					if (i < 10) sb.append("0");
					sb.append(i);
					alist.add(sb.toString());
					N--;
				}
				if (N==0) break;
			}
			
			System.out.println(alist.get(alist.size()-1));
			
		}
		sc.close();
	}
}