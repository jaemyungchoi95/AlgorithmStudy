import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		PriorityQueue<String> pq = new PriorityQueue<>(new Comparator<String>() {
			
			@Override
			public int compare(String o1, String o2) {
				int size1 = o1.length();
				int size2 = o2.length();
				// 사이즈가 같지 않으면 오름차순 정렬
		        if (size1 != size2) {
	            return size1 - size2; // 길이 오름차순 정렬
		        }
		        // 사이즈가 같아질때 사전순 정렬
		        return o1.compareTo(o2); // 길이가 같다면 사전순 정렬
			}
		});
		
		for(int i = 0; i < N; i++) {
			String str = sc.next();
			pq.add(str);
		}
		String prev = "";
		while(!pq.isEmpty()) {
			String s = pq.poll();
			if (s.equals(prev)) continue;
			System.out.println(s);
			prev = s;
		}
		
		sc.close();
	} // main
} // class
