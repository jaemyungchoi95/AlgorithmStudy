import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int T = Integer.parseInt(br.readLine()); // 테스트케이스의 수 
		
		for (int tc = 1; tc <= T; tc++) {
			String[] str = br.readLine().split("");
			Deque<String> deq = new ArrayDeque<>();
			String prev = "";
			
			for (int i = 0; i < str.length; i++) {
				if (deq.isEmpty()) {
					deq.addFirst(str[i]);
				} else {
					prev = deq.peekFirst();
					if (str[i].equals(")") && prev.equals("(")) {
						deq.pollFirst();
					} else {
						deq.addFirst(str[i]);
					}
				}
			}
			
		if (!deq.isEmpty()) {
			bw.write("NO\n");
		} else {
			bw.write("YES\n");
		}
			
		} // tc
		
		bw.flush();
		bw.close();
		br.close();
	} // main
	
} // class
