import java.util.Scanner;

class Solution {
	static int N, M; // 주어지는 첫번째 숫자 N, 두번째 숫자 M
    
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
        
		// 이 문제는 총 10개의 테스트케이스가 주어진다
		for(int test_case = 1; test_case <= 10; test_case++) {
			sc.nextInt(); // 테스트케이스의 번호
			 N = sc.nextInt(); // 주어지는 첫번째 숫자 N을 입력받는다
			 M = sc.nextInt(); // 주어지는 두번째 숫자 M을 입력받는다
			 
			 // 정답 출력
			 System.out.printf("#%d %d\n", test_case, pow(N, M));
			
		} // 테스트케이스 끝
        sc.close();
	} // main 끝
    
	// 거듭제곱을 구하는 재귀함수
	private static int pow(int N, int M) {
		// 거듭제곱 횟수가 O이 되면 1을 반환
		if (M == 0) {
	        return 1;
	        // 거듭제곱의 횟수가 0이 아니라면 N 과 추가적인 재귀함수를 반환하여 결과값을 누적해준다
	    } else {
	        return N * pow(N, M - 1);
	    }
	}
	
} // 클래스 끝