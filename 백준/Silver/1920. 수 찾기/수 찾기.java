import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Set<Integer> set = new HashSet<>();
		int N = Integer.parseInt(br.readLine()); // 자연수 N의 개수 
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			set.add(Integer.parseInt(st.nextToken()));
		}
		
		int M = Integer.parseInt(br.readLine()); // 찾아야 할 수의 개수 M
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < M; i++) {
			int tmp = Integer.parseInt(st.nextToken());
			
			if (set.contains(tmp)) {
				bw.write(1 + "\n");
			} else {
				bw.write(0 + "\n");
			}
		}
		
		bw.flush();
		bw.close();
		br.close();
	} // main
	
} // class
