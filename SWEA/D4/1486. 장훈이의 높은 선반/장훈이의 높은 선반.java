import java.util.Scanner;
import java.io.FileInputStream;

class Solution {
	static int N, B; // 점원의 수 N, 선반의 높이 B
	static int[] arr; // 점원의 키를 담아줄 배열 선
	static int min; // 최저 높이차를 담아줄 변수 선언
	
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt(); // 테스트케이스의 수
		
		// 테스트케이스만큼 반복한다
		for(int test_case = 1; test_case <= T; test_case++) {
			N = sc.nextInt(); // 점원의 수 N
			B = sc.nextInt(); // 선반의 높이 B
			min = Integer.MAX_VALUE; // 최저 높이차를 초기화
			
			arr = new int[N]; // 점원의 키를 담아줄 배열 선언 후 담아준다
			for (int i = 0; i < N; i++) {
				arr[i] = sc.nextInt();
			}
			
			// 조합 함수 호출
			comb(0, 0);
			
			// 정답 출력
			System.out.printf("#%d %d\n", test_case, min);
		} // 테스트케이스
		
	} // main
	
	// 조합 함수
	private static void comb(int start, int sum) {
		// 기저 조건 
		// 합이 선반의 높이와 같거나 보다 클때
		if (sum >= B) {
			// 최소값을 업데이트 해준다 (탑의 합계 - 선반의 높이)
			min = Math.min(min, sum - B);
			return;
		}
		// 만약 대상에 해당하지 않더라도 끝까지 갔으면 끝낸다
		if (start == N) return;
		
		// 재귀 조건
		// 점원의 키를 고려할 때 -> 해당 인덱스의 키를 sum에 누적해준다
		comb(start + 1, sum + arr[start]);
		// 점원의 키를 고려하지 않을 때 -> 이전의 합계 그대로 넘어간다
		comb(start + 1, sum);
	} // comb
	
} // class