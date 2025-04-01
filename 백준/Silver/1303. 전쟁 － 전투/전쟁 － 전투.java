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
		
		int M = Integer.parseInt(st.nextToken()); // 전쟁터의 가로 크기 M // 원래 입력과 반대로 받아줬다
		int N = Integer.parseInt(st.nextToken()); // 전쟁터의 세로 크기 N // 원래 입력과 반대로 받아줬다
		
		String[][] arr = new String[N][M]; // 전쟁판의 현황을 담아줄 2차원 배열
		
		// 배열에 현황을 담아준다
		for (int i = 0; i < N; i++) {
			arr[i] = br.readLine().split("");
		}
		
		// 4방향 델타 탐색 : 상 우 하 좌
		int[] dx = {-1, 0, 1, 0};
		int[] dy = {0, 1, 0, -1};
		
		Deque<int[]> deq = new ArrayDeque<>(); // 덱 선언
		boolean[][] visited = new boolean[N][M]; // 방문여부를 체크할 배열 선언
		
		int ansW = 0; // W의 개수 누적 변수
		int ansB = 0; // B의 개수 누적 변수
		
		// 전체를 순회하면서
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				// 만약 방문했던 곳이라면 건너뛰기
				if (visited[i][j]) continue;
				// 방문하지 않은 장소라면 일단 돌려준다
				deq.addLast(new int[] {i, j}); // 일단 첫번째 돌입지점을 담아준다
				visited[i][j] = true; // 방문처리
				String now = arr[i][j]; // 지금 무슨 글자인지?
				
				int cnt = 1; // 글자의 중간 개수를 중간 카운트해줄 변수 선언
				
				// 덱이 빌때까지 순환하면서
				while(!deq.isEmpty()) {
					int[] tmp = deq.pollFirst(); // 첫번째 원소를 꺼내어준다
					int curX = tmp[0];
					int curY = tmp[1];
					
					for (int d = 0; d < 4; d++) {
						int nx = curX + dx[d];
						int ny = curY + dy[d];
						
						// 탐색하지 않는 조건들
						// 1. 범위
						if (nx < 0 || nx >= N || ny < 0 || ny >= M) continue;
						// 2. 방문여부
						if (visited[nx][ny]) continue;
						// 3. 처음 돌입할 때  "W" 였는지 "B" 였는지 확인해야 한다
						if (!arr[nx][ny].equals(now)) continue;
						
						// 처음 돌입과 같은 글자라면
						deq.addLast(new int[] {nx, ny}); // 큐에 추가
						visited[nx][ny] = true; // 방문처리
						cnt++; // 카운트 증가
					} // for d
				} // while
				
				// 한번의 while문이 끝나면 cnt값의 제곱을 ans에 추가
				if (now.equals("W")) {
					ansW += (int)Math.pow(cnt, 2);
				} else if (now.equals("B")) {
					ansB += (int)Math.pow(cnt, 2);
				}
			}
		}
		
		// 정답 출력
		bw.write(ansW + " " + ansB + "\n");
		
		bw.flush();
		bw.close();
		br.close();
	} // main
	
} // class
