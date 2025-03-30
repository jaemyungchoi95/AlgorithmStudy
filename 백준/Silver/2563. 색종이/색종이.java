import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		int N = Integer.parseInt(br.readLine()); // 색종이의 수 N
		
		boolean[][] visited = new boolean[101][101]; // 색종이가 공간을 차지하는지 담아줄 방문 배열
		
		// 각 색종이마다 색종이의 크기를 입력받아준다
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			int strX = Integer.parseInt(st.nextToken()); // 시작점의 x축
			int strY = Integer.parseInt(st.nextToken()); // 시작점의 y축
			
			// 입력받은 시작과 끝 값을 바탕으로 색종이의 영역을 방문처리 해준다
			for (int j = strY; j < strY + 10; j++) {
				for (int k = strX; k < strX+10; k++) {
					if(visited[j][k]) continue;
					visited[j][k] = true;
				}
			}
		}
		
		// 색종이 면적의 합계를 담아줄 변수 선언
		int sum = 0;
		
		// 전체를 순회하면서 true인 부분을 발견하면 sum을 증가시켜준다
		for (int i = 0 ; i < 101; i++) {
			for (int j = 0; j < 101; j++) {
				if (visited[i][j]) sum++;
			}
		}
		
		// 정답 출력
		bw.write(sum + "\n");
		
		bw.flush();
		bw.close();
		br.close();
	} // main
	
} // class
