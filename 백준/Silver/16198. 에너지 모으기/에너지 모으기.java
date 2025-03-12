import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static ArrayList<Integer> arr; // 에너지 구슬의 무게 배열 선언
	static int N; // 에너지 구슬의 개수 N 선언
	static int sum, max; // 합계를 담아줄 변수 sum, 최대값을 담아줄 max 선언
	
	public static void main(String[] args) throws Exception {
		N = Integer.parseInt(br.readLine()); // 에너지 구슬의 개수 N 입력
		arr = new ArrayList<>(); // 에너지 구슬의 무게 배열 초기화
		sum = 0; // 합계 0으로 초기화
		max = 0; // 최대값 0으로 초기화
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		// 에너지 구슬의 무게 배열 입력
		for (int i = 0; i < N; i++) {
			arr.add(Integer.parseInt(st.nextToken())); 
		}
		// 재귀함수 호출
		func(arr);
		
		// 정답 출력
		bw.write(max + "\n");
		bw.flush();
		bw.close();
		br.close();
	} // main
	
	// 재귀함수
	static void func( ArrayList<Integer> arr) {
		// 종료조건
		// 배열의 사이즈가 2가 되면 종료
		if (arr.size() == 2) {
			// 최대값을 업데이트 해준다
			max = Math.max(max, sum);
			return;
		}
		
		// 탐색조건 : 첫번째와 마지막번째를 제외한 인덱스의 값을 탐색해준다
		for (int i = 1; i < arr.size()-1; i++) {
			// 현재 가지에서의 i-1 * i+1 을 구해준다
			int tmp = arr.get(i-1)*arr.get(i+1);
			sum += tmp; // 합계에 현재 가지의 합을 담아주고
			// 배열을 복사한다음
			ArrayList<Integer> cpArr = new ArrayList<>(arr);
			cpArr.remove(i); // 복사한 배열에서 x에 헤당하는 인덱스를 삭제해주고
			func(cpArr); // 다시 재귀호출을 해준다 (첫번째 인덱스부터 시작해야 하므로 
			sum -= tmp; // 한번 탐색 후 다시 이전상태로 돌아가기 위해 tmp를 다시 빼준다
		}
	
	} // func 
	
} // class
