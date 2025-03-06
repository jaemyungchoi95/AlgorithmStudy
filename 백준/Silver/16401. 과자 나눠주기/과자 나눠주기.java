import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

// 과자나눠주기!
public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int M = Integer.parseInt(st.nextToken()); // 조카의 수 M
		int N = Integer.parseInt(st.nextToken()); // 과자의 수 M
		int max = Integer.MIN_VALUE; // 최대 값을 담아줄 변수 선언 (정수의 최소값으로 초기화)
		
		int[] arr = new int[N]; // 각 과자의 길이를 담아줄 정수 배열 선언
		st = new StringTokenizer(br.readLine());
		// 정수배열에 길이를 담아준다
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			// 담아주면서 동시에 최대값을 업데이트 한다
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		// 배열을 정렬해준다
		Arrays.sort(arr);
		
		int start = 1; // 탐색의 시작값
		int end = max; // 탐색의 최대값
		int ans = 0; // 결과를 담아줄 변수 선언
		
		// start가 end보다 같거나 작을동안만 반복하면서
		while (start <= end) {
			int mid = (start + end)/2; // 탐색의 중간 변수는 계속 업데이트 해준다
			int cnt = 0;
			
			// 탐색조건
			// 과자길이 배열을 탐색하면서 cnt 변수에 각 과자의 길이를 mid로 나누어준 몫을 더해준다
			for (int i = 0; i < N; i++) {
				cnt += arr[i]/mid;
			}
			
			// 만약 cnt가 M보다 크거나 같으면 일단 
			if (cnt >= M) {
				ans = mid; // 결과 변수에 mid값을 업데이트 해준다
				start = mid+1; // 시작변수를 mid+1로 바꿔준다
				// 반대의 경우라면
			} else {
				end = mid-1; // 끝변수를 mid-1로 바꿔준다				
			}
		}
		
		// 정답 출력
		bw.write(ans + "\n");
		
		bw.flush();
		bw.close();
		br.close();
	} // main 끝
	
} // 클래스 끝
