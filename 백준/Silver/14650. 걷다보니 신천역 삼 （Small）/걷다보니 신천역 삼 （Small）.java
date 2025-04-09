import java.io.*;
import java.util.Arrays;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static int N, count;
	static int[] arr;
	
	public static void main(String[] args) throws Exception {
		N = Integer.parseInt(br.readLine()); // N 자리의 3의 배수를 만들어야 한다 (0, 1, 2)
		arr = new int[N];
		
		
		comb(0);
		
		bw.write(count + "\n");
		bw.flush();
		bw.close();
		br.close();
	}

	private static void comb(int cnt) {
		if (cnt == N) {
			// 0으로 시작하는 수는 만들 수 없음!
			if (arr[0] == 0) return;
			
			// 0으로 시작하지 않는다면 합계를 더해서
			int tmp = Arrays.stream(arr).sum();
			// 각 자리수의 합이 3이어야 하기 때문에 자리수의 합계들을 모두 더한 것에서 3으로 나누면 나머지가 0일때 배수임
			if (tmp %3 == 0) {
				count++;
			}
			return ;
		}
		
		for (int i = 0; i < 3; i++) {
			arr[cnt] = i;
			comb(cnt+1);
		}
	}
}