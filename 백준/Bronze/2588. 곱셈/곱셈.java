import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());
		int n = 1;
		int answer = 0;
		
		String[] arr = br.readLine().split("");
		
		for (int i = 0; i <= 2; i++) {
			System.out.println(a * Integer.parseInt(arr[2 - i]));
			answer += (a * Integer.parseInt(arr[2 - i])) * n;
			n *= 10;
		}
		
		System.out.println(answer);

	}
}
