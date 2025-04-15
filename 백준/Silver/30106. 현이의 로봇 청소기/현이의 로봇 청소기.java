import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken()); // 세로 길이 N
		int M = Integer.parseInt(st.nextToken()); // 가로 길이 M
		int K = Integer.parseInt(st.nextToken()); // 로봇이 이동할 수 있는 영역 K
		
		int[][] arr = new int[N][M];
		int cnt = 0;
		
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < M; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		// 상 우 하 좌 순으로 탐색
		int[] dx = {-1, 0, 1, 0};
		int[] dy = {0, 1, 0, -1};

		boolean[][] visited = new boolean[N][M];
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				if (visited[i][j]) continue;
				
				Deque<int[]> deq = new ArrayDeque<>();
				deq.addLast(new int[] {i, j});
				visited[i][j] = true;
				
				while (!deq.isEmpty()) {
					int[] curr = deq.pollFirst();
					
					for (int d = 0; d < 4; d++) {
						int nx = curr[0] + dx[d];
						int ny = curr[1] + dy[d];
						
						if (nx < 0 || nx >= N || ny < 0 || ny >= M) continue;
						if (visited[nx][ny]) continue;
						if (Math.abs(arr[nx][ny] - arr[curr[0]][curr[1]]) > K) continue;
						
						deq.addLast(new int[] {nx, ny});
						visited[nx][ny] = true;
					}
				}
				cnt++;
			}
		}
		
		bw.write(cnt + "\n");
		
		bw.flush();
		bw.close();
		br.close();
	}
}
