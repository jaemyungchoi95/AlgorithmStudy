import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringTokenizer st;
	static int N, M;
	static int[] arr, answer;
	static boolean[] visited;
	
	public static void main(String[] args) throws Exception {
		st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken()); 
		M = Integer.parseInt(st.nextToken());
		
		arr = new int[N];
		answer = new int[N];
		visited = new boolean[N];
		
		for (int i = 0; i < N; i++) {
			arr[i] = i+1;
		}
		
		perm(0);
		
		bw.flush();
		bw.close();
		br.close();
	} // main
	
	static void perm(int depth) throws IOException {
		if (depth == M) {
			for (int i = 0; i < M; i++) {
				bw.write(answer[i] + " ");
			}
			bw.newLine();
			return ;
		}
		
		for (int i = 0; i < N; i++) {
			if (!visited[i]) {
				visited[i] = true;
				answer[depth] = arr[i];
				perm(depth + 1);
				visited[i] = false;
			}
		}
	}
	
} // class
