import java.util.Scanner;
import java.io.FileInputStream;
import java.util.ArrayDeque;
import java.util.Deque;

public class Solution {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		for (int test_case = 1; test_case <= 10; test_case++) {
			String[] arr = sc.nextLine().split("");
			
			Deque<String> stack = new ArrayDeque<>();
			
			for (int i = 3; i < arr.length; i++) {
				if (stack.isEmpty()) {
					stack.addLast(arr[i]);
				} else {
					if (arr[i].equals(stack.peekLast())) {
						stack.removeLast();
					} else {
						stack.addLast(arr[i]);
					}
				}
			}
			
			StringBuilder sb = new StringBuilder();
			
			while(!stack.isEmpty()) {
				sb.append(stack.removeFirst());
			}
			
			// 테스트케이스 출력
			System.out.printf("#%d %s\n", test_case, sb);
			
		} // 테스트케이스 끝
		sc.close();
	} //main 끝
	
} // 클래스 끝