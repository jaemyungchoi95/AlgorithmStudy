import java.util.Scanner;
import java.io.FileInputStream;

class Solution {
	static int[][] arr; // 재료의 맛과 점수를 담아줄 배열
	static int N, L, max; // 재료의 수 N, 제한 칼로리 L, 최대 점수를 담아줄 변수 max
	
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt(); // 테스트케이스의 수
		
		for (int test_case = 1; test_case <= T; test_case++) {
			N = sc.nextInt(); // 재료의 수 N
			L = sc.nextInt(); // 제한 칼로리 L
			// 재료의 맛과 점수를 담아줄 배열 (0 : 점수, 1 : 칼로리)
			arr = new int[N][2];
			
			for (int i = 0; i < N; i++) {
				arr[i][0] = sc.nextInt(); // 재료의 점수
				arr[i][1] = sc.nextInt(); // 재료의 칼로리
			}
			
			max = 0; // 최대 점수는 0으로 초기화
			comb(0, 0, 0); // 조합을 선언하고 모든 조합수 탐색을 위해 최초값을 전부 0으로 부여한다
			
			// 정답 출력 (연산 후 가장 마지막으로 업데이트 된 max값을 정답으로 출력)
			System.out.printf("#%d %d\n", test_case, max);
			
		} // 테스트케이스 끝
		sc.close();
	} // main 끝
	
	// 조합을 계산하기 위한 조합함수
	private static void comb(int idx, int calSum, int scoreSum) {
		// 종료조건
		if (calSum > L) {
			return ; // 제한 칼로리를 초과할 경우 탈출
		}
		// 전부 탐색했을 경우 최종적으로 가장 높은 값을 max값으로 업데이트
		if (idx == N) {
			max = Math.max(max, scoreSum);
			return ; // 이후 탈출합니다
		}
		
		// 재귀조건
		// 해당 재료를 선택했을 때는 재료의 칼로리와 점수 합계에 각각 재료의 칼로리와 점수를 누적시켜줍니다
		// 다시 재귀함수로 탐색할 때, 종료조건에 따라 해당되지 않는 케이스는 탈출하게 됩니다.
		comb(idx + 1, calSum + arr[idx][1], scoreSum + arr[idx][0]);
		// 해당 재료를 선택하지 않았을 때는 입력받았던 최초의 값을 그대로 반영합니다 (즉, 변화 X)
		comb(idx + 1, calSum, scoreSum);
	}
	
} // 클래스 끝
