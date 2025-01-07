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
import java.io.*;
import java.io.FileInputStream;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++)
		{
            int a = sc.nextInt();
            int b = sc.nextInt();
            
            int[] arrA =new int[a];
            int[] arrB = new int[b];

            for (int i = 0; i < a; i++) {
                arrA[i] = sc.nextInt();
            }
            for (int i = 0; i < b; i++) {
                arrB[i] = sc.nextInt();
            }
            
			int maxSum = Integer.MIN_VALUE;
            
            // A배열이 더 짧거나 같은 경우
			if (a <= b) {
            	for (int i = 0; i <= b - a; i++) { // 배열길이의 차이만큼 순회하면서
                    int currentSum = 0;
					for (int j = 0; j < a; j++) { // 작은 배열의 길이만큼 순회하면서
						currentSum += arrA[j] * arrB[i + j];
                    }
					maxSum = Math.max(maxSum, currentSum);
                }
            } else {
            	for (int i = 0; i <= a - b; i++) {
					int currentSum = 0;
                    for (int j = 0; j < b; j++) {
                    	currentSum += arrB[j] * arrA[i + j];
                    }
                    maxSum = Math.max(maxSum, currentSum);
                }
            }
            System.out.printf("#%d %d%n", test_case, maxSum);
		}
        sc.close();
	}
}