import java.util.Scanner;
import java.io.FileInputStream;
import java.util.Arrays;

public class Solution {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt(); // 테스트케이스의 수
		
		for (int test_case = 1; test_case <= T; test_case++) {
			int[][] arr = new int[9][9]; // 스도쿠 판을 담아줄 2차원 정수 배열
			int ans = 1;
 			
			// 스도쿠 판을 담아준다
			for (int i = 0; i < 9; i++) {
				for (int j = 0; j < 9; j++) {
					arr[i][j] = sc.nextInt();
				}
			}
			
			// 8방향 델타탐색 : 상, 상우, 우, 우하, 하, 하좌, 좌, 좌상
			int[] dx = {-1, -1, 0, 1, 1, 1, 0, -1};
			int[] dy = {0, 1, 1, 1, 0, -1, -1, -1};
			
			int[] testArr = new int[10]; // 1~9 까지의 숫자를 테스트 해줄 정수 배열
				
			// 먼저 8방향 델타탐색부터 해준다
			for (int i = 1; i < 8; i += 3) {
				for (int j = 1; j < 8; j += 3) {
					Arrays.fill(testArr, 0);
					testArr[arr[i][j]]++; // 최초 위치의 숫자에 해당하는 인덱스를 1 증가시켜준다
					for (int d = 0; d < 8; d++) {
						int nx = i + dx[d];
						int ny = j + dy[d];
						testArr[arr[nx][ny]]++; // 8방향을 탐색하면서 나온 숫자에 1씩 인덱스 증가
					}
					
					// 만약 8방 탐색 후  인덱스가 1이 넘는 배열이 있으면 실패
					for (int k = 1; k < 10; k++) {
						if (testArr[k]> 1) {
							ans = 0;
							break;
						}
					}
				}
			} // 8방 델타탐색
			
			// 8방향 델타탐색이 문제없었다면 다음으로 좌우 직선검사
			for (int i = 0; i < 9; i++) {
				Arrays.fill(testArr, 0);
				for (int j = 0; j < 9; j++) {
					testArr[arr[i][j]]++;
					
					// 만약 양방향 탐색 후  인덱스가 1이 넘는 배열이 있으면 실패
					for (int k = 1; k < 10; k++) {
						if (testArr[k]> 1) {
							ans = 0;
							break;
						}
					}
				}
				
				Arrays.fill(testArr, 0);
				for (int j = 0; j < 9; j++) {
					testArr[arr[j][i]]++;
					
					// 만약 양방향 탐색 후  인덱스가 1이 넘는 배열이 있으면 실패
					for (int k = 1; k < 10; k++) {
						if (testArr[k]> 1) {
							ans = 0;
							break;
						}
					}
				}
				
			} // 좌우 직선검사
			
			// 정답 출력
			System.out.printf("#%d %d\n", test_case, ans);
			
		} // 테스트케이스 끝
		sc.close();
	} // main 끝
	
} // 클래스 끝
