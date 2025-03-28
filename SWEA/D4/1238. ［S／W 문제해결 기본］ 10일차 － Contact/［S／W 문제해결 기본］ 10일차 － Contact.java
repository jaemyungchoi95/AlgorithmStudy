import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import java.util.Scanner;
import java.io.FileInputStream;

class Solution {
    	
	static final int INF = Integer.MAX_VALUE; // 최대값 INF 선언
	static int N, V; // 입력받는 데이터의 길이 N, 시작노드 V 선언
	static List<Integer>[] adj; // 인접리스트 선언
	static boolean[] visited; // 방문여부 배열 선언
    
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		// 이 문제는 테스트케이스 10개가 주어진다
		for(int test_case = 1; test_case <= 10; test_case++) {
			N = sc.nextInt(); // 입력받는 데이터의 길이 N
			V = sc.nextInt(); // 시작노드 V
			int max = Integer.MIN_VALUE;
			
			adj = new ArrayList[101]; // 인접리스트의 길이를 N만큼 초기화해주고
			for (int i = 0; i < 101; i++) {
				adj[i] = new ArrayList<>(); // 각 자리마다 ArrayList로 초기화 해준다
			}
			
			visited = new boolean[101]; // 방문여부 배열을 초기화 해준다
			
			// 연락망을 인접리스트에 담아준다
			for (int i = 0; i < N/2; i++) {
				int from = sc.nextInt();
				int to = sc.nextInt();
				
				adj[from].add(to); // 유향
			} // 간선 입력
			
			Deque<Integer> deq = new ArrayDeque<>(); // 연락관계 추적을 위한 Deq
			
			deq.add(V); // 비상연락망을 시작하는 사람의 번호를 넣어주고
			visited[V] = true; // 방문여부를 체크해준다
			
			// 덱이 빌때까지 반복하면서
			while (!deq.isEmpty()) {
                int size = deq.size();
				int levelMax = 0; // 현재 레벨의 최대값
				
				// 현재 기준 덱만큼의 사이즈까지 돌면서
				for (int i = 0; i < size; i++) {
					int tmp = deq.pollFirst();
					levelMax = Math.max(levelMax, tmp); // 현재 레벨 최대값 갱신

					for (int next : adj[tmp]) {
						if (!visited[next]) {
							deq.addLast(next);
							visited[next] = true;
						}
					}
				}
				max = levelMax;
			}
			// 정답 출력
			System.out.printf("#%d %d\n",test_case, max);
		} // 테스트케이스
		sc.close();
	} // main

} // class