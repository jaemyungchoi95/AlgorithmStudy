import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// 입력을 정수 배열로 담아준다
		int[] numArr = Arrays.stream(br.readLine()
						.split(" "))
						.mapToInt(Integer::parseInt)
						.toArray();
		
		Arrays.sort(numArr); // 정수배열을 오름차순으로 정렬
		
		int answer = 0; // 정답을 반환하는 변수 선언
		int[] tempArr = new int[7]; // 숫자를 카운트해 줄 임시배열 선언
		
		// 주사위 숫자를 임시배열에 담아준다
		for (int i : numArr) {
			tempArr[i]++;
		}
		
		boolean isAllDifferent = true;
		// 임시배열을 탐색하면서 조건에 맞다면 점수를 계산해준다.
		for (int i = 1; i <= 6; i++) {
			// 같은 눈이 3개 나오면 10,000 + i*1,000
			if (tempArr[i] == 3) {
				answer = 10000 + (i * 1000);
				isAllDifferent = false;
				break;
			// 같은 눈이 2개 나오면 1,000 + i * 100
			} else if (tempArr[i] == 2) {
				answer = 1000 + (i * 100);
				isAllDifferent = false;
				break;
			}
		}
		
		// 모두 다른 눈이 나오면 정수배열의 최대값 * 100
		if (isAllDifferent) {
			answer = numArr[numArr.length - 1] * 100;
		}
		System.out.print(answer);
	}
}
