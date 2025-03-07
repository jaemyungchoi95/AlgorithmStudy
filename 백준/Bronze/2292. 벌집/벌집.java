import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		int idx = 1;
		int curr = 1;
		
		while (curr < N) {
			curr += 6*idx;
			idx++;
		}
		
		bw.write(idx + "\n");
		bw.flush();
		bw.close();
		br.close();
	}
}
