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
		
		int R = Integer.parseInt(st.nextToken()); // 행의 수
		int C = Integer.parseInt(st.nextToken()); // 열의 수
		// 행과 열을 n과 m으로 치환해준다
		int n = R; // 또는 x
		int m = C; // 또는 y
		
		String[][] board = new String[n][m]; // 울타리와 양, 늑대의 현황을 담아줄 문자열 2차원 배열 선언
		boolean[][] visited = new boolean[n][m]; // 너비우선탐색을 위한 방문여부 배열 선언
		int sheep = 0; // 양의 수를 담아줄 변수 선언
		int wolves = 0; // 늑대의 수를 담아줄 변수 선언
		
		// 문자열 배열을 채워준다
		for (int i = 0; i < n; i++) {
			board[i] = br.readLine().split("");
		}
		
		// 4방 탐색 : 상, 우, 하, 좌
		int[] dx = {-1, 0, 1, 0};
		int[] dy = {0, 1, 0, -1};
		
		// 전체적인 board를 탐색한다
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				// 만약 탐색장소가 이미 방문한 곳이거나 벽이라면 지나간다
				if (visited[i][j] || board[i][j].equals("#")) continue;
				
				Deque<int[]> deq = new ArrayDeque<>(); // 1회 탐색에 대한 대상을 담아줄 큐 선언 (Deque 사용)
				deq.addLast(new int[] {i, j}); // 현재 위치를 먼저 큐에 넣어주고
				visited[i][j] = true; // 방문 위치를 표시해준다
				// 한 구역에 있는 양과 늑대의 숫자를 임시로 담아줄 변수
				int tmpSheep = 0;
				int tmpWolves = 0;
				// 만약 탐색자리가 o 혹은 v이면 각각 양이나 늑대의 수에 1씩 더해준다 
				if (board[i][j].equals("o")) {
					tmpSheep = 1;
				} else if (board[i][j].equals("v")) {
					tmpWolves = 1;
				}
				
				// 큐가 빌때까지 반복하면서
				while (!deq.isEmpty()) {
					int[] tmp = deq.pollFirst();
					int curX = tmp[0];
					int curY = tmp[1];
					
					// 4방 델타탐색 진행
					for (int d = 0; d < 4; d++) {
						int nx = curX + dx[d];
						int ny = curY + dy[d];
						// nx와 ny가 범위를 벗어나면 탐색하지 않는다
						if (nx < 0 || nx >= n || ny < 0|| ny >= m) continue;
						// 벽이거나 이미 방문했던 장소라도 건너뛴다
						if (board[nx][ny].equals("#") || visited[nx][ny]) continue;
						// 위의 조건에 해당하지 않는다면
						deq.addLast(new int[] {nx, ny}); // 다음 탐색리스트에 넣어주고
						visited[nx][ny] = true; // 방문여부를 체크해준다
						
						// 양 혹은 늑대일 경우 각각의 변수에 카운트
						if (board[nx][ny].equals("o")) {
							tmpSheep++;
						} else if (board[nx][ny].equals("v")) {
							tmpWolves++;
						}
					}
				} // while
				
				// 한 구역의 탐색이 모두 끝났을 때 양의 수가 더 많으면 양의 수에 카운트 
				if (tmpSheep > tmpWolves) {
					sheep += tmpSheep;
					// 늑대의 수와 같거나 늑대가 더 많다면 늑대 카운트
				} else {
					wolves += tmpWolves;
				}
			} // for j
		} // for i
		
		bw.write(sheep + " " + wolves + "\n");
		
		bw.flush();
		bw.close();
		br.close();
	}
}
