import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static int N, M; // 자연수의 개수 N, 수열의 길이 M
	static int[] arr; // 자연수를 담아줄 1차원 정수 배열
	static int[] ans; // 선택된 숫자들을 담아줄 1차원 정수 배열
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st= new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken()); // 자연수의 개수 N을 입력받는다
		M = Integer.parseInt(st.nextToken()); // 수열의 길이 M을 입력받는다
		
		st = new StringTokenizer(br.readLine());
		
		ans = new int[N]; // 선택된 숫자들을 담아줄 1차원 정수 배열의 크기 할당
		
		arr = new int[N]; // 자연수를 담아줄 1차원 정수 배열의 크기를 할당해주고
		// 입력받은 순서대로 일단 배열에 넣어준다
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr); // 사전순으로 증가하는 수열이기 때문에 정렬부터 해준다
		
		// 만약 수열의 길이가 1이면
		if (M == 1) {
			// 정렬된 배열을 그대로 하나씩 출력해주고
			for (int i = 0; i < N; i++) {
				bw.write(arr[i] + "\n");
			}
			// 수열의 길이가 자연수 N과 동일하면
		} else if (N == M) {
			// 입력받아서 사전순으로 정렬된 그대로 출력해준다
			StringBuilder sb = new StringBuilder();
			for (int num : arr) {
				sb.append(num).append(" ");
			}
			bw.write(sb.substring(0, sb.length()-1));
			// 그 외의 길이라면 재귀함수를 통해 수열을 뽑아낸다
		} else {
			comb(0, 0, 0); // 초기값은 전부 0으로 부여해준다
		}
		
		bw.flush();
		bw.close();
		br.close();
	} // main 끝
	
	// 중복되지 않는 항목을 수열을 얻기 위한 재귀함수
	static void comb(int idx, int cnt, int prev) throws IOException {
		// 종료조건
		// 만약 뽑은 숫자가 수열의 길이와 동일해지면
		if (cnt == M) {
			// 수열의 길이만큼만 탐색해서 출력해준다
			for (int i = 0; i < M; i++) {
				bw.write(ans[i] + " ");
			}
			// 한개의 수열을 출력하고 나면 띄워주고
			bw.write("\n");
			return ; // 이번 재귀를 종료한다
		}
		
		// 재귀조건
		for (int i = idx; i < N; i++) {
			if (arr[i] > prev) {
				ans[cnt] = arr[i];
				comb(i + 1, cnt + 1, arr[i]);
			}
		}
		
	}
	
} // 클래스 끝