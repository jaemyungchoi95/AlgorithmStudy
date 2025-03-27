import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

// 로또
public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringTokenizer st;
	
	static int[] arr, caseArr; // 로또번호를 입력받아줄 배열 arr, 6개를 뽑은 결과를 담아줄 배열 caseArr 선언
	static int k; // 로또 번호의 개수를 담아줄 k 선언
	
	public static void main(String[] args) throws Exception {
		String input;
		
		// 입력이 0 이 아닐때까지 입력받는다
		while (!(input = br.readLine()).equals("0")) {
			st = new StringTokenizer(input);
			k = Integer.parseInt(st.nextToken()); // 로또 번호의 개수를 담아줄 k 초기화
			arr = new int[k]; // 로또번호를 입력받아줄 배열 초기화
			caseArr = new int[6]; //  6개를 뽑은 결과를 담아줄 배열 caseArr 초기화
			
			// 로또번호를 입력받아준다
			for (int i = 0; i < k; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
			}
			
			// 재귀함수 호출
			comb(0, 0);
			bw.newLine();
		} // testcase while
		
		bw.flush();
		bw.close();
		br.close();
	} // main
	
	// 조합 구현을 위한 재귀함수
	static void comb(int str, int cnt) throws IOException {
		// 종료조건
		if (cnt == 6) {
			for (int i = 0; i < 6; i++) {
				bw.write(caseArr[i] + " ");
			}
			bw.newLine();
			return ;
		}
		
		// 재귀 조건
		// arr의 전체 범위까지 돌면서
		for (int i = str; i < k; i++) {
			// 만약 방문했으면 건너뛰어준다
			caseArr[cnt] = arr[i];
			comb(i + 1, cnt + 1);
		}
		
	}
	
} // class
