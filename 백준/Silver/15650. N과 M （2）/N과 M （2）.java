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
	
	public static void main(String[] args) throws Exception {
		st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken()); // 자연수 N
		M = Integer.parseInt(st.nextToken()); // 수열의 길이 M
		
		arr = new int[N];
		answer = new int[N];
		
		for (int i = 0; i < N; i++) {
			arr[i] = i+1;
		}
		
		perm(0, 0);
		
		bw.flush();
		bw.close();
		br.close();
	} // main

	private static void perm(int str, int depth) throws IOException {
		// 종료 조건
		if (depth == M) {
			for (int i = 0; i < M; i++) {
				bw.write(answer[i] + " ");
			}
			bw.newLine();
			return ;
		}
		
		// 재귀 조건
		for (int i = str; i < N; i++) {
			answer[depth] = arr[i];
			perm(i+1, depth+1);
		}
		
	} // perm()
	
} // class
