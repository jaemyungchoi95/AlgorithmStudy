import java.util.Scanner;
import java.io.FileInputStream;

class Solution {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++) {
			int N = sc.nextInt(); // 농장의 크기
			sc.nextLine(); // 개행문자 제거
			int[][] arr = new int[N][N]; // 농장 수확물을 담아줄 정수 2차원 배열
			int sum = 0; // 합계를 담아줄 변수
			
			// 배열에 수를 담아준다
			for (int i = 0; i < N; i++) {
				String[] str = sc.nextLine().split("");
				for (int j = 0; j < N; j++) {
					arr[i][j] = Integer.parseInt(str[j]);
				}
			}
			
			// 전체 
			int startIdx = N/2;
			int endIdx = N/2;
			
			for (int i = 0; i < N; i++) {
				if (i > 0 && i < N/2) {
					startIdx -= 1;
					endIdx += 1;
				} else if (i == N/2) {
					startIdx = 0;
					endIdx = N-1;
				} else if (i > N/2) {
					startIdx += 1;
					endIdx -= 1;
				}
				
				for (int j = startIdx; j <= endIdx; j++) {
					sum += arr[i][j];
				}
			}
			
			// 테스트케이스 출력
			System.out.printf("#%d %d\n", test_case, sum);
			
			
		} // 테스트케이스 끝
        sc.close();
	} // main 끝
    
} // 클래스 끝
