import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] str = sc.next().split(""); // 그릇의 모양
		
		Stack<String> stack = new Stack<>();
		
		for (String s : str) {
			stack.push(s);
		}
		
		int sum = 0;
		String prev = "";
		while (!stack.isEmpty()) {
			// 모양이 ( 이면서 이전의 모양이 같은 모양이 아니면 10점을 반환하고 빼준다
			if (stack.peek().equals("(") && !prev.equals("(")){
				sum += 10;
				prev = stack.pop();
				// 모양이 ) 이면서 이전의 모양이 같은 모양이 아니면 10점을 반환하고 빼준다
			} else if (stack.peek().equals(")") && !prev.equals(")")) {
				sum += 10;
				prev = stack.pop();
				
			} else if (stack.peek().equals("(") && prev.equals("(")) {
				sum += 5;
				prev = stack.pop();
			} else if (stack.peek().equals(")") && prev.equals(")")) {
				sum += 5;
				prev = stack.pop();
			} 
		}
		
		System.out.println(sum);
		
		sc.close();
	} // main 끝
	
} // 클래스 끝