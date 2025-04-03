import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] str = br.readLine().split("");
		int aCnt = 0; // a의 개수 변수
		
		// a의 개수를 세어 변수에 담아준다
		for (int i = 0; i < str.length; i++) {
			if (str[i].equals("a")) aCnt++;
		}
		
		int min = Integer.MAX_VALUE; // 최소 횟수를 담아줄 변수 선언
		
		// 전체적으로 순회하면서
		for (int i = 0; i < str.length; i++) {
			int tmpB = 0; // 임시로 b의 개수를 세어줄 변수 선언
			// a의 개수가 연속되어야 하기 때문에 a의 개수만큼을 또 돌아준다
			for (int j = 0; j < aCnt; j++) {
				// 범위가 넘어가면 다시 처음부터 탐색하기 위해 인덱스를 새로 지정해준다
				// 문자열의 길이로 나눈 나머지가 인덱스가 될 수 있음 (길이와 인덱스가 기본적으로 1 차이 나기때문에)
				int curr = (i+j)%str.length;
				// b를 발견하면 갯수를 새어준다
				if (str[curr].equals("b")) {
					tmpB++;
				}
			}
			// 한번의 범위 탐색이 끝날때마다 b의 값이 더 작은 방향으로 업데이트
			if (tmpB < min) min = tmpB;
			
		}
		// 정답 출력
		bw.write(min + "");
		
		bw.flush();
		bw.close();
		br.close();
	} // main
	
} // class
