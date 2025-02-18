import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 2 x n 타일링
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()); // 직사각형의 크기

        int[] dp = new int[1001];

        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 2;

        if (n == 1) {
            System.out.println(1);
            return;
        } else if (n == 2) {
            System.out.println(2);
            return;
        }

        for (int i = 3; i <= n; i++) {
            dp[i] = (dp[i-1] + dp[i-2]) % 10007;
        }

        System.out.println(dp[n]);

    }
}
