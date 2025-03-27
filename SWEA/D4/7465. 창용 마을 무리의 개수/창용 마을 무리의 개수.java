import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import java.util.Scanner;
import java.io.FileInputStream;

class Solution {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt(); // 테스트케이스의 수
		
        // 테스트케이스만큼 반복한다
		for(int test_case = 1; test_case <= T; test_case++) {
			int N = sc.nextInt(); // 창용마을에 살고 있는 사람의 수 N
			int M = sc.nextInt(); // 서로 알고있는 관계의 수 M
			int cnt = 0; // 무리의 수를 담아줄 변수 선언
			
			List<Integer>[] arr = new ArrayList[N+1]; // 관계를 담아줄 인접리스트 선언
			// 배열을 ArrayList로 초기화 해준다
			for (int i = 1; i <= N; i++) {
				arr[i] = new ArrayList<>();
			}
			
			// 인접리스트에 관계를 담아준다
			for (int i = 0; i < M; i++) {
				int a = sc.nextInt();
				int b = sc.nextInt();
				
				// 양방향으로 인접리스트에 관계를 담아준다 (서로 알고있기 때문)
				arr[a].add(b); // [a번 사람을].add(b번 사람이 알고있음)
				arr[b].add(a); // [b번 사람을].add(a번 사람이 알고있음)
			}
			
			boolean[] visited = new boolean[N+1]; // 관계 체크여부를 담아줄 방문배열 선언
			visited[0] = true; // 0번인덱스는 사용하지 않을 것이기 때문에 미리 방문체크
			Deque<Integer> deq = new ArrayDeque<>(); // 친한관계 방문순서를 담아줄 Deq 선언
			
			// 주민들을 한면씩 돌면서
			for (int i = 1; i <= N; i++) {
				// 이미 방문한 주민이라면 넘기고
				if (visited[i]) continue;
				deq.addLast(i); // 방문하지 않은 다음 주민부터 탐색한다
				cnt++; // 한 무리의 시작이므로 cnt 증가
			
				// 큐가 빌때까지
				while (!deq.isEmpty()) {
					int loc = deq.pollFirst(); // 순차적으로 방문순서를 뽑는다
					if (visited[loc]) continue; // 뽑은 방문지기 이미 방문했던 곳이라면 넘긴다
					visited[loc] = true; // 탐색하는 방문지역은 표시
					
					// 해당 방문지에서 관계가 있는 사람들은 전부 큐에 담아준다
					for (int j = 0; j < arr[loc].size(); j++) {
						deq.add(arr[loc].get(j));
					}
				}
			}
			// 정답 출력
			System.out.printf("#%d %d\n", test_case, cnt);
		} // 테스트케이스
		sc.close();
	} // main
	
} // class
