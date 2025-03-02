import java.util.Scanner;
import java.io.FileInputStream;
import java.util.ArrayDeque;
import java.util.Deque;

public class Solution {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		// 이 문제에는 총 10개의 test_case가 주어진다
		for (int test_case = 1; test_case <= 10; test_case++) {
			int N = sc.nextInt();
			sc.nextLine(); // 개행문자 제거
			String[] s = sc.nextLine().split("");
			
			Deque<String> stack = new ArrayDeque<>();
			
			for (String str : s) {
				if (stack.isEmpty()) {
					stack.addFirst(str);
				} else {
					if (str.equals(")") && stack.peekFirst().equals("(")) {
						stack.removeFirst();
					} else if (str.equals("}") && stack.peekFirst().equals("{")) {
						stack.removeFirst();
					} else if (str.equals("]") && stack.peekFirst().equals("[")) {
						stack.removeFirst();
					} else if (str.equals(">") && stack.peekFirst().equals("<")) {
						stack.removeFirst();
					} else {
						stack.addFirst(str);
					}
				}
			}
			
			// 배열의 탐색이 끝났을 때 빈배열이라면 정답 출력
			if (stack.isEmpty()) {
				System.out.printf("#%d %d\n", test_case, 1);
			} else {
				System.out.printf("#%d %d\n", test_case, 0);
			}
			
		}
	}
}