import java.util.*;

class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        int length = arr.length;
        boolean isTrue = true;
        
        while(isTrue) {
            // 사이클 진입 시마다 복사 배열을 통해 이전 배열을 남김
            int[] prev = arr.clone(); 
            
            // 내부의 값을 변경하기 위한 for 문
            for(int i = 0; i < length; i++) {
                // 조건 1. 원소 값이 50보다 크거나 같은 짝수라면 2로 나누고
                if (arr[i] >= 50 && arr[i]%2 == 0) {
                    arr[i] = arr[i]/2;
                    // 조건 2. 50보다 작은 홀수라면 2를 곱하고 다시 1을 더한다.
                } else if (arr[i] < 50 && arr[i]%2 != 0) {
                    arr[i] = (arr[i]*2)+1;
                }
            }
            // 한사이클의 변경이 종료된 후 이전과 비교
            if (Arrays.equals(prev, arr)) {
                return answer;
            }
            // 같지않다면 횟수를 증가시킴
            answer++;
        }
        
        return answer;
    }
}