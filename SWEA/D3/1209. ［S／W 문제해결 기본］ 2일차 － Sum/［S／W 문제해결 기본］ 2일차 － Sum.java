/////////////////////////////////////////////////////////////////////////////////////////////
// 기본 제공코드는 임의 수정해도 관계 없습니다. 단, 입출력 포맷 주의
// 아래 표준 입출력 예제 필요시 참고하세요.
// 표준 입력 예제
// int a;
// double b;
// char g;
// String var;
// long AB;
// a = sc.nextInt();                           // int 변수 1개 입력받는 예제
// b = sc.nextDouble();                        // double 변수 1개 입력받는 예제
// g = sc.nextByte();                          // char 변수 1개 입력받는 예제
// var = sc.next();                            // 문자열 1개 입력받는 예제
// AB = sc.nextLong();                         // long 변수 1개 입력받는 예제
/////////////////////////////////////////////////////////////////////////////////////////////
// 표준 출력 예제
// int a = 0;                            
// double b = 1.0;               
// char g = 'b';
// String var = "ABCDEFG";
// long AB = 12345678901234567L;
//System.out.println(a);                       // int 변수 1개 출력하는 예제
//System.out.println(b); 		       						 // double 변수 1개 출력하는 예제
//System.out.println(g);		       						 // char 변수 1개 출력하는 예제
//System.out.println(var);		       				   // 문자열 1개 출력하는 예제
//System.out.println(AB);		       				     // long 변수 1개 출력하는 예제
/////////////////////////////////////////////////////////////////////////////////////////////
import java.util.*;
import java.io.FileInputStream;

/*
   사용하는 클래스명이 Solution 이어야 하므로, 가급적 Solution.java 를 사용할 것을 권장합니다.
   이러한 상황에서도 동일하게 java Solution 명령으로 프로그램을 수행해볼 수 있습니다.
 */
class Solution
{
	public static void main(String args[]) throws Exception
	{

		Scanner sc = new Scanner(System.in);

		for(int test_case = 1; test_case <= 10; test_case++)
		{
		
            int tNum = sc.nextInt();
			int[][] arr = new int[100][100]; // 크기가 100*100인 배열 선언
			int sumX1 = 0; // 대각선 좌상 -> 우하
			int sumX2 = 0; // 대각선 우상 -> 좌하
			int[] sumRowArr = new int[100]; // 가로 합 배열
			int[] sumColArr = new int[100]; // 세로 합 배열
			
			// for문을 통하여 배열에 값을 담아준다
			for (int i = 0; i < 100; i++) {
				for (int j = 0; j < 100; j++) {
					arr[i][j] = sc.nextInt();
				}
			}
			
			// for문을 이용하여 대각선 탐색
			for (int i = 0; i < 100; i++) {
				sumX1 += arr[i][i];
				sumX2 += arr[i][99-i];
				int tempRowSum = 0;
				int tempColSum = 0;
				for (int j = 0; j < 100; j++) {
					tempRowSum += arr[i][j];
					tempColSum += arr[j][i];
				}
				sumRowArr[i] = tempRowSum;
				sumColArr[i] = tempColSum;
			}
			
			Arrays.sort(sumRowArr);
			Arrays.sort(sumColArr);
			
			System.out.printf("#%d %d\n", tNum, Math.max(Math.max(sumX1, sumX2), Math.max(sumRowArr[99], sumColArr[99])));
			

		}
	}
}