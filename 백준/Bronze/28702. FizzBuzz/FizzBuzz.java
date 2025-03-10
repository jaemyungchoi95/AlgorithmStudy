import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {
	static BufferedReader br;
	static BufferedWriter bw;
	static int tmp;
	public static void main(String[] args) throws Exception {
		br = new BufferedReader(new InputStreamReader(System.in));
		bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] arr = new String[3];
		
		for (int i = 0; i < 3; i++) {
			arr[i] = br.readLine();
		}
		
		for (int i = 0; i < 3; i++) {
			if (Character.isDigit(arr[0].charAt(0))) {
				tmp = Integer.parseInt(arr[0])+3; // 하나를 더해준다.
				break;
				// 만약 세번째 입력받은 값이 숫자라면
			} else if (Character.isDigit(arr[1].charAt(0))) {
				tmp = Integer.parseInt(arr[1])+2; // 하나를 더해준다.
				break;
				// 세번째 값이 숫자가 아닐 경우
			} else if (Character.isDigit(arr[2].charAt(0))) {
				tmp = Integer.parseInt(arr[2])+1; // 하나를 더해준다.
				break;
			}
		}
		
		bw.write(fnc(tmp));
		
		bw.flush();
		bw.close();
		br.close();
	}
	
	static String fnc(int tmp) {
		// 3의 배수이면서 5의 배수이면
		if (tmp%15 == 0) {
			return "FizzBuzz\n";
		} else if (tmp%3 == 0) { // 3의 배수이면
			return "Fizz\n";
		} else if (tmp%5 == 0) {
			return "Buzz\n"; // 5의 배수이면
		} else {
			return Integer.toString(tmp)+"\n";
		}
	}
}
