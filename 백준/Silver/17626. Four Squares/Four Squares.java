import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

		// DP 배열 선언
		int[] dp = new int[N + 1];
		Arrays.fill(dp, Integer.MAX_VALUE); // 큰 값으로 초기화
		dp[0] = 0; // 0을 만들기 위해 필요한 개수는 0개

		// DP 점화식 적용
		for (int i = 1; i <= N; i++) {
			for (int j = 1; j * j <= i; j++) {
				dp[i] = Math.min(dp[i], dp[i - j * j] + 1);
			}
		}

		// 정답 출력
		System.out.println(dp[N]);
	}
}