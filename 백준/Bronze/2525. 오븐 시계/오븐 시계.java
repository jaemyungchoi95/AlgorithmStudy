import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] timeArr = Arrays.stream(br.readLine()
						.split(" "))
						.mapToInt(Integer::parseInt)
						.toArray();
		
		int n = Integer.parseInt(br.readLine());
		
		// 만약 분과 요리시간 n을 더한 숫자가 60 미만이면
		if (timeArr[1] + n < 60) {
			timeArr[1] += n;
		// 더한 시간이 60분이면 시간에 1을 더하고 분을 0으로 한다
		} else if ((timeArr[1] + n) == 60) {
			timeArr[0] += 1;
			timeArr[1] = 0;
		// 더한 시간이 그 외에 해당하면 60분단위로 시간을 더해주고 나머지는 분으로 대입해준다
		} else {
			int tempNum = (timeArr[1] + n)/60;
			timeArr[0] += tempNum;
			timeArr[1] = (timeArr[1] + n)%60;
		}
		// 만약 24시 이상이 되면 시간을 24로 나눈 나머지를 대입해준다
		if (timeArr[0] >= 24) {
			timeArr[0] %= 24;
		}
		
		System.out.print(timeArr[0] + " " + timeArr[1]);
	}
}
