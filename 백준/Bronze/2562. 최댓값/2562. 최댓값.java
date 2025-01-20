import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> arr = new ArrayList<>(); // 입력받은 숫자를 담아줄 정수 배열
		int m = 0; // 최대값을 담아줄 숫자
		
		// 수 9가지를 입력받아 배열에 넣어준다
		for (int i = 0; i < 9; i++) {
			arr.add(sc.nextInt());
		}
		
		// 최대값을 찾아준다
		for (int i : arr) {
			if (i > m) {
				m = i;
			}
		}
		
		// 최대값과 그 인덱스를 찾아 출력해준다
		System.out.println(m);
		System.out.print(arr.indexOf(m)+1);
		
		sc.close();
	}
}
