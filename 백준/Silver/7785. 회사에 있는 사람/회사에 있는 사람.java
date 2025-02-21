import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine()); // 출입기록의 수
		HashMap<String, String> map = new HashMap<>(); // 출근현황을 담아줄 해시맵 선언
		
		// 출입기록에 해당하는 사람을 담아준다
		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String name = st.nextToken();
			String status = st.nextToken();
			map.put(name, status);
		}
		
		ArrayList<String> arr = new ArrayList<>();
		
		for (String key : map.keySet()) {
			if (map.get(key).equals("enter"))
				arr.add(key);
		}
		
		Collections.sort(arr , Collections.reverseOrder());
		
		for (String name : arr) System.out.println(name);
	}
}
