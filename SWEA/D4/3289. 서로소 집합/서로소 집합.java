import java.util.Scanner;
import java.io.FileInputStream;

class Solution {
	static int[] p; // 대표를 저장할 배열
	
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt(); // 테스트케이스를 입력받는다
		
		// 테스트케이스만큼 반복
		for(int test_case = 1; test_case <= T; test_case++) {
			int n = sc.nextInt(); // 집합의 수 n 을 입력받는다
			int m = sc.nextInt(); // 연산의 수 m 을 입력받는다
			StringBuilder sb = new StringBuilder(); // 정답을 담아줄 스트링빌더
			
			p = new int[n+1]; // 서로소 집합의 크기 초기화
			// make-set을 통해서 각자 본인이 대표가 되도록 서로소 집합 초기화
			for (int i = 1; i <= n; i++) {
				p[i] = i;
			} // 초기화 완료
			
			// 연산의 횟수만큼 반복하면서
			for (int i = 0; i < m; i++) {
				int t = sc.nextInt(); // 집합의 타입 / 0 : 합집합 , 1 : 서로 포함된지 확인
				int a = sc.nextInt(); // 집합 a
				int b = sc.nextInt(); // 집합 b
				
				// a와 b의 범위가 서로소집합 p의 범위를 벗어나지 않도록 체크
				if (a >= 1 && a <= n && b >= 1 && b <= n) {
					// 타입이 0일 경우
					if (t == 0) {
						union(a, b); // 합집합 진행
						// 그 외의 경우 (1일 경우)
					} else {
						// 같은 그룹에 속해있는지 검사하여
						if (findSet(a) == findSet(b)) {
							sb.append("1"); // 같은 그룹이라면 1
						} else {
							sb.append("0"); // 아니라면 0을 스트링빌더에 담아준다
						}
					}
				}
			} // 연산 케이스
			
			// 정답 출력
			System.out.printf("#%d %s\n",test_case, sb.toString());
		} // 테스트케이스
		sc.close();
	} // main
	
	static void union(int x, int y) {
		x = findSet(x);
		y = findSet(y);
		
		if (x != y) {
			if (x < y) {
				p[y] = x;
			} else {
				p[x] = y;
			}
		}
	}

	static int findSet(int x) {
		// 경로 압축
		if (x != p[x]) p[x] = findSet(p[x]);
		return p[x];
		
	}
} // class