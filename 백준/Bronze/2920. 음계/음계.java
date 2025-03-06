import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] str = br.readLine().split(" ");
		int[] arr = new int[8];
		
		for (int i = 0; i < 8; i++) {
			arr[i] = Integer.parseInt(str[i]);
		}
		
		boolean asc = true;
		boolean desc = true;
		
		for (int i = 1; i < 8; i++) {
			if (arr[i] > arr[i-1]) {
				desc = false;
			} else if (arr[i] < arr[i-1]) {
				asc = false;
			}
		}
		
		if (asc) {
			bw.write("ascending" + "\n");
		} else if (desc) {
			bw.write("descending" + "\n");
		} else {
			bw.write("mixed" + "\n");
		}
		
		bw.flush();
		bw.close();
		br.close();
	}
}
