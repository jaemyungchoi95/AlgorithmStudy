import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.StringTokenizer;

// 작업
public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken()); // 작업할 개수 N
		int M = Integer.parseInt(st.nextToken()); // 작업 순서 K
		int sum = 0; // 필요한 작업의 개수를 담아줄 sum 변수
		
		ArrayList<ArrayList<Integer>> alist = new ArrayList<>(N+1); // 작업 관계를 담아줄 인접 리스트 alist 선언 (크기는 N+1로 해준다)
		// alist의 각 자리를 ArrayList로 초기화 해준다
		for (int i = 0; i <= N; i++) {
			alist.add(new ArrayList<>());
		}
		
		// 작업의 순서를 입력받는다
		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			int A = Integer.parseInt(st.nextToken()); // 선수작업 A
			int B = Integer.parseInt(st.nextToken()); // 후작업 B
			// 인접리스트의 후작업을 불러서 그 안에 선수작업을 넣어준다
			alist.get(B).add(A);
		}
//		for (int i = 0; i <= N; i++) {
//			bw.write(i + "\n");
//			bw.write(alist.get(i) + "\n");
//		}
		
		int X = Integer.parseInt(br.readLine()); // 오늘 반드시 끝내야 하는 작업 X
		Deque<Integer> deq = new ArrayDeque<>(); // 선수작업을 탐색해줄 덱 (큐로 활용 예정) 선언
		deq.addLast(X); // 꼭 끝내야 할 작업인 X를 덱에 담아준다
		boolean[] visited = new boolean[N+1]; // 방문여부 배열 추가
		visited[X] = true; // x번 배열에 대해 방문여부를 체크한다
		
		
		// 덱이 빌때까지 반복하면서
		while (!deq.isEmpty()) {
			// 현재 탐색하는 작업을 뽑아주고
			int curr = deq.pollFirst();
			// 현재 탐색하는 작업의 배열을 돌면서
			for (int i = 0; i < alist.get(curr).size(); i++) {
				// 만약 해당 열이 방문하지 않았을때만
				if (!visited[alist.get(curr).get(i)]) {
					// 방문할 후보로 덱에 넣어주고
					deq.addLast(alist.get(curr).get(i));
					// 현재 위치를 방문으로 체크해준다
					visited[alist.get(curr).get(i)] = true;
					// 합계에 더해준다
					sum++;
				}
			}
			
		} // while
		
		bw.write(sum + "\n");
		bw.flush();
		bw.close();
		br.close();
		
	} // main
	
} // class