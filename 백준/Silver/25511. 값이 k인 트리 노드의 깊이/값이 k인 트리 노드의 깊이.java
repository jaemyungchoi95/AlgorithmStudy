import java.io.*;
import java.util.*; 

// 값이 k인 트리 노드의 깊이
public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken()); // 정점의 수 N
		int K = Integer.parseInt(st.nextToken()); // 정수 K
		
		// 노드의 관계를 담아줄 인접리스트 선언 및 초기화
		List<Integer>[] list = new ArrayList[N];
		for (int i = 0; i < N; i++) {
			list[i] = new ArrayList<>();
		}
		
		// 부모자식의 관계를 담아준다
		for (int i = 0; i < N-1; i++) {
			st= new StringTokenizer(br.readLine());
			int p = Integer.parseInt(st.nextToken()); // 부모 노드 p
			int c = Integer.parseInt(st.nextToken()); // 자식 노드 c
			
			// 부모 인덱스에 자식을 가진다
			list[p].add(c);
		}
		
		int[] arr = new int[N]; // 각 정점에 부여된 번호를 담아줄 정수 배열 선언
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) { // 각 정점에 순서대로 입력되는 정점의 값을 담아준다
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		int target = 0; // K의 값을 담고있는 노드의 번호를 담아줄 변수 선언
		// 정점순서대로 값을 탐색하며, 타겟 노드의 번호를 찾아준다
		for (int i = 0; i < N; i++) {
			if (arr[i] == K) {
				target = i;
				break;
			}
		}
		
		Deque<Integer> deq = new ArrayDeque<>();
		boolean[] visited = new boolean[N];
		
		// 정점의 첫번째 값을 먼저 담아준다
		deq.addLast(0);
		visited[0] = true;
		
		int level = 0;
		while(!deq.isEmpty()) {
			int size = deq.size();
			
			// 같은 레벨에 속한 원소를 찾는다
			for (int i = 0; i < size; i++) {
				int tmp = deq.pollFirst();
				
				// 만약 그 레벨에서 target을 발견하면 멈추고 현재까지 저장된 레벨을 출력
				if (tmp == target) {
					bw.write(level + "\n");
					bw.flush();
					bw.close();
					return;
				}
				
				// 덱의 다음 레벨의 자식들을 순환하면서 방문하지 않은 곳들은 담아준다
				for (int child : list[tmp]) {
					if (!visited[child]) {
						visited[child] = true;
						deq.offer(child);
					}
				}
			}
			// 레벨에 대한 탐색이 끝나면 증가
			level++;
		} // while
		
		bw.flush();
		bw.close();
		br.close();
	} // main
	
} // class