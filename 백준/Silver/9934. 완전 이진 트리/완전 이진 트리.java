import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static int K; // 정답을 출력하는 줄 수 (Depth) 선언
	static String[] arr; // 상근이가 방문한 빌딩의 번호를 담아줄 1차원 배열 선언
	static List<List<String>> ans; // 레벨별로 정리된 루트를 담아줄 인접리스트 선언
	
	public static void main(String[] args) throws Exception {
		K = Integer.parseInt(br.readLine()); // 정답을 출력하는 줄 수 (Depth) 입력
		arr = br.readLine().split(" "); // 상근이가 방문한 빌딩의 번호 입력
		ans = new ArrayList<>(); // 인접리스트의 전체적인 형식을 ArrayList 형식으로 초기화
		
		// 인접리스트의 각 항목에 빈 ArrayList를 넣어 초기화 해준다
		for (int i = 0; i < K; i++) {
			ans.add(new ArrayList<>());
		}
		
		// 재귀함수 호출
		func(0, arr.length-1, 0);
		
		// 인접리스트의 결과 출력
		for (int i = 0; i < ans.size(); i++) {
			// 출력 시 String.join 메서드로 문자열 출력
			bw.write(String.join(" ", ans.get(i)) + "\n");
		}
		
		bw.flush();
		bw.close();
		br.close();
	} // main
	
	// 재귀함수
	static void func(int start, int end, int level) throws IOException {
		int mid = (start+end)/2; // 중앙값을 계산해주고
		// 종료조건 : level이 K만큼 도달하면 종료
		if (level == K) {
			return;
		}
		
		// 인접 리스트에 레벨별로 중앙값을 담아준다
		ans.get(level).add(arr[mid]);
		
		// 한 레벨이 끝났으면 중앙값을 기준으로 양옆의 중앙값을 찾고 다음 레벨에 저장해준다
		func(start, mid-1, level+1);
		func(mid+1, end, level+1);
	}
	
} // class
