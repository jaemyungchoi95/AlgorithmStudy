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
import java.util.Scanner;
import java.io.FileInputStream;

/*
   사용하는 클래스명이 Solution 이어야 하므로, 가급적 Solution.java 를 사용할 것을 권장합니다.
   이러한 상황에서도 동일하게 java Solution 명령으로 프로그램을 수행해볼 수 있습니다.
 */
class Solution
{
	public static void main(String args[]) throws Exception
	{
		/*
		   아래의 메소드 호출은 앞으로 표준 입력(키보드) 대신 input.txt 파일로부터 읽어오겠다는 의미의 코드입니다.
		   여러분이 작성한 코드를 테스트 할 때, 편의를 위해서 input.txt에 입력을 저장한 후,
		   이 코드를 프로그램의 처음 부분에 추가하면 이후 입력을 수행할 때 표준 입력 대신 파일로부터 입력을 받아올 수 있습니다.
		   따라서 테스트를 수행할 때에는 아래 주석을 지우고 이 메소드를 사용하셔도 좋습니다.
		   단, 채점을 위해 코드를 제출하실 때에는 반드시 이 메소드를 지우거나 주석 처리 하셔야 합니다.
		 */
        Scanner sc = new Scanner(System.in);
		
		// 이번 문제의 테스트케이스는 10으로 고정
		for(int test_case = 1; test_case <= 10; test_case++)
		{
			int N = sc.nextInt(); // 건물 갯수 입력
			int[] arr = new int[N]; // 건물의 높이를 담아 줄 배열
			// 배열에 건물의 높이를 담아준다
			for (int i = 0; i < N; i++) {
				arr[i] = sc.nextInt();
			}
			
			int cnt = 0; // 세대 수를 카운트하는 변수
			
			// 첫 두 건물과 마지막 두 건물이 무조건 0이기 때문에 탐색범위 제한하여 탐색한다.
			for (int i = 2; i < N-2; i++) {
				int max = -1; // 건물의 최대값을 담아준다
                
				// i를 기준으로 보았을 때 양옆은 점검한다
				for (int j = i-2; j <= i+2; j++) {
					// 자기 자신은 비교에서 배제하고
					if (i != j) {
						// max 값을 갱신
						max = Math.max(max, arr[j]);
					}
				}
				// 나의 건물높이가 max값보다 크면 나의 건물높이 - max값을 더해준다
				if (arr[i] > max) cnt += arr[i] - max;
			}
			// 테스트케이스가 종료될 때마다 결과 출력
			System.out.printf("#%d %d\n", test_case, cnt);
		}
	}
}