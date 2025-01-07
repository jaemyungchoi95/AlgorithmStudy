import java.util.*;
import java.io.*;
import java.io.FileInputStream;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T =sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++)
		{
			int n = sc.nextInt(); // 배열의 크기를 입력받는다
            int[][] arr = new int[n][n]; // 2차원 배열을 생성해준다.
            
            // 2차원 배열에 테스트케이스를 담아준다.
          	for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
                    arr[i][j] = sc.nextInt();
                }
            }
            
            // 회전결과를 각 배열을 선언하여 저장해준다.
            int[][] arr90 = new int[n][n];
            int[][] arr180 = new int[n][n];
            int[][] arr270 = new int[n][n];
            
            // 회전한 모습 계산
            for (int i = 0; i < n; i++) {
            	for (int j = 0; j < n; j++) {
                    arr90[i][j] = arr[n - 1 - j][i];
                    arr180[i][j] = arr[n - 1 - i][n - 1 - j];
                    arr270[i][j] = arr[j][n - 1 - i];
                }
            }
            
            // 결과물 출력
            System.out.printf("#%d\n", test_case);
            for (int i = 0; i < n; i++) {
            	for (int j = 0; j <n; j++) System.out.print(arr90[i][j]);
                System.out.print(" ");
                for (int j = 0; j <n; j++) System.out.print(arr180[i][j]);
                System.out.print(" ");
                for (int j = 0; j <n; j++) System.out.print(arr270[i][j]);
                System.out.println();
            }
		}
	}
}