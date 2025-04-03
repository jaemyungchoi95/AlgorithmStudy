import java.io.*;
import java.util.*;

public class Main {
	static class Node {
		int x, y;

		public Node(int x, int y) {
			this.x = x;
			this.y = y;
		}
		
	}
	
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine()); // 좌표의 개수 N
		
		Node[] nodes = new Node[N];
		
		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			
			nodes[i] = new Node(x, y);
		}
		
		Arrays.sort(nodes, (n1, n2) -> {
			if (n1.y != n2.y) {
				return n1.y - n2.y;
			} else {
				return n1.x - n2.x;
			}
		});
		
		for (Node n : nodes) {
			bw.write(n.x + " " + n.y + "\n");
		}
		
		bw.flush();
		bw.close();
		br.close();
	} // main
	
} // class
