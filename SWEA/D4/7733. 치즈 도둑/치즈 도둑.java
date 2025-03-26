import java.util.Scanner;
import java.io.FileInputStream;
import java.util.ArrayDeque;
import java.util.Deque;

class Solution {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt(); // 테스트케이스의 수
        
		// 테스트케이스의 수만큼 반복한다
		for(int test_case = 1; test_case <= T; test_case++) {
			int N = sc.nextInt(); // 치즈판의 크기 N
			
			int[][] arr = new int[N][N]; // 치즈판
			int max = Integer.MIN_VALUE; // 맛있는 정도의 최대값을 담아줄 변수 선언
			int maxCnt = 0; // 덩어리의 최고값을 갱신
			
			// 치즈판에 맛있는 정도를 담아준다
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					int tmp = sc.nextInt();
					arr[i][j] = tmp;
					// 맛있는 정도의 최고값을 업데이트 해준다
					if (max < tmp) max = tmp;
				}
			}
			
			// 4방향 탐색 : 상, 하, 좌, 우
			int[] dx = {-1, 1, 0, 0};
			int[] dy = {0, 0, -1, 1};
			
			// 가장 맛있는 정도까지 반복하면서
			for (int k = 0; k < max; k++) {
				// 맛있는 정가 올라갈 때마다 deq를 다시 선언해준다
				Deque<int[]> deq = new ArrayDeque<>();
				boolean[][] visited = new boolean[N][N]; // 방문여부 배열도 한번 방문시마다 선언해준다
				int cnt = 0; // 맛있는 정도 하나당 덩어리를 세어줄 변수 선언
				
				
				for (int i = 0; i < N; i++) {
					for (int j = 0; j < N; j++) {
						
						if (arr[i][j] <= k) continue;
						if (visited[i][j]) continue;
						
						deq.addLast(new int[] {i, j}); // 첫번째 탐색 구역을 넣어주고
						visited[i][j] = true; // 방문 체크를 해준다
						
						// 덱이 빌때까지 반복하면서
						while (!deq.isEmpty()) {
							int[] tmpArr = deq.pollFirst(); // 첫번째 값을 빼준다
							
							int curX = tmpArr[0]; // 현재 위치의 x (혹은 r 혹은 n 값)
							int curY = tmpArr[1]; // 현재 위치의 y (혹은 c 혹은 m 값)
							
							// 인접한 4방향을 탐색해준다
							for (int d = 0; d < 4; d++) {
								int nx = curX + dx[d];
								int ny = curY + dy[d];
								
								// 1. 탐색 범위 초과 방지 제한
								if (nx < 0 || nx >= N ||ny < 0 || ny >= N) continue;
								// 2. 방문한 곳은 탐색 제한
								if (visited[nx][ny]) continue;
								// 3. 맛있는 정도를 넘어가는 범위에 대한 탐색 제한
								if (arr[nx][ny] <= k) continue;
								// 위의 제한을 뚫고 방문했던 곳은 새로운 큐에 넣어주고
								deq.addLast(new int[] {nx, ny});
								// 방문배열 true로 전환
								visited[nx][ny] = true;
							}
						}
						// 한 덩어리에 대한 탐색이 끝나면 cnt를 증가시켜준다
						cnt++;
					} // 맛있는 정도 반복문
				}
				// 만약 맛 하나에 대한 탐색이 끝나면 
				if (cnt > maxCnt) {
					maxCnt = cnt;
				}
			}
					
			// 테스트케이스 종료 시 정답 출력
			System.out.println("#" + test_case + " " + maxCnt);
		} // 테스트케이스
        sc.close();
	} // main
    
} // class