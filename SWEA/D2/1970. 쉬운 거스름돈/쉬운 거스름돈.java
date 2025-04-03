import java.util.Scanner;
import java.io.FileInputStream;

class Solution {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt(); // 테스트케이스의 수
        
		// 테스트케이스만큼 반복한다
		for(int test_case = 1; test_case <= T; test_case++) {
			int N = sc.nextInt(); // 돈의 개수를 구해야 할 대상 금액
			int[] arr = {50000, 10000, 5000, 1000, 500, 100, 50, 10}; // 나누어줄 금액대 배열
			StringBuilder sb = new StringBuilder(); // 결과를 담아줄 StringBuilder
			
			// 금액대 배열을 순회하면서
			for (int i = 0; i < arr.length; i++) {
				// 몫이 1 이상이라면
				if (N / arr[i] > 0) {
					// sb에 N을 arr[i]의 금액으로 나누어준 몫을 담아주고
					sb.append(N/arr[i]).append(" ");
					// N을 몫 * 금액만큼 빼주어 상태를 업데이트 해준다
					N -= (N/arr[i]) * arr[i];
					// 몫이 1이 되지 않는다면 0을 담아주고 넘어간다
				} else {
					sb.append(0).append(" ");
				}
			}
			
			// 정답 출력
			System.out.printf("#%d\n%s\n", test_case, sb.toString().trim());
		} // 테스트케이스
		sc.close();
	} // main
	
} // class