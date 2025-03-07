import java.util.Arrays;
import java.util.Scanner;
import java.io.FileInputStream;

class Solution {
	static int[] arr; // 규영이가 받은 카드를 담아줄 정수 배열 arr 선언
	static int[] arrIn; // 인영이가 낼 수 있는 카드를 담아줄 정수 배열 arrIn 선언
	static boolean[] visited; //방문 체크를 위핸 visited 배열 선언
	static int[] combArr; // 인영이가 낼 카드를 순열로 담을 combArr 배열 선언
	static int win, loose; // 인영이가 이기는 경우를 담아줄 변수 win, 인영이가 지는 경우를 담아줄 변수 loose 선언
	
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt(); // 테스트케이스의 수

		// 테스트케이스의 수만큼 반복해준다
		for(int test_case = 1; test_case <= T; test_case++) {
			arr = new int[9]; // 규영이가 받은 카드를 담아줄 정수 배열 초기화
			arrIn = new int[9]; // 인영이가 낼 수 있는 카드를 담아줄 정수 배열 초기화
			visited = new boolean[9]; // 카드를 사용했는지 여부 배열 초기화
			combArr = new int[9]; // 인영이가 낼 카드를 순열로 담을 배열 초기화
			
			String[] tmp = new String[9]; // 인영이가 낼 수 있는 카드인지 판단하기 위한 임시 배열 선언
			win = 0; // 승리 횟수를 0으로 초기화
			loose = 0; // 패배 횟수도 0으로 초기화
			
			// 규영이가 받는 카드의 수를 저장해준다
			for (int i = 0; i < 9; i++) {
				arr[i] = sc.nextInt();
				tmp[i] = Integer.toString(arr[i]);
			}
			
			// 인영이가 낼 수 있는 카드를 배열에 담아준다
			int idx = 0; // 인영이의 카드 배열 인덱스로 활용해줄 변수 선언
			// 1 ~ 18까지의 숫자를 순회하면서
			for (int i = 1; i <= 18; i++) {
				// 만약 규영이가 이미 가지고 있는 카드로 판단되지 않는다면
				// (Arrays.contains() 를 활용하여 조회할 경우 return값이 boolean으로 반환됩니다)
				// (만약 포함된 숫자가 있으면 true, 없다면 false를 반환하기 때문에 false를 반환하는 경우에만 i를 배열에 넣어준다!!)
				if (!Arrays.asList(tmp).contains(Integer.toString(i))) {
					arrIn[idx++] = i; // 인영이의 카드목록에 넣어준다
				}
			}
			
			// 재귀함수 호출
			perm(0);
			
			// 정답을 출력해준다
			System.out.printf("#%d %d %d\n", test_case, win, loose);
		} // 테스트케이스 끝
        sc.close();
	} // main 끝
	
	// 조합을 진행해주는 재귀함수
	static void perm(int idx) {
		// 기저조건 : 9개의 카드를 다 사용했다면 아래의 조건문으로 들어간다
		if (idx == 9) {
			int subtotal= 0; // 각 게임의 점수 차 (반복시마다 초기화)
			// 규영이와 인영이의 카드 점수차를 각 자리수별로 구해서
			for (int i = 0; i < 9; i++) {
				// 규영이가 이겼다면 두 카드의 합을 양수로 누적
				if (arr[i] > combArr[i]) {
					subtotal += (arr[i]+combArr[i]);
					// 인영이가 이겼다면 두 카드의 합을 음수로 누적해준다
				} else {
					subtotal -= (arr[i]+combArr[i]);
				}
			}

			// 자리수의 비교가 끝나고
			// 양수가 나오면 규영이가 이긴 경우로 판단하여 win을 증가시켜주고
			if (subtotal > 0) {
				win++;
				// 음수가 나오면 인영이가 이긴 경우로 판단하여 loose를 증가시켜준다
			} else {
				loose++;
			}
			return ; // 한번의 선택이 끝나면 함수 탈출
		}
		
		// 재귀부분
		// 카드의 수만큼 탐색하면서
		for(int i = 0; i < 9; i++) {
			// 아직 사용되지 않은 카드만 사용한다
			if (visited[i]) continue;
			// 인영이의 배열에서 사용되지 않은 카드들을 우선으로 넣어준다
			combArr[idx] = arrIn[i];
			visited[i] = true; // 사용처리
			perm(idx+1); // 다음 카드 선택을 위해 인덱스를 증가시켜 재귀호출
			visited[i] = false; // 원상복구
			
		}
	} // perm 함수 끝
    
} // 클래스 끝