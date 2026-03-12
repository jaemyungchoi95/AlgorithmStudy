import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[] query) {
        // Arrays.copyOfRange(대상 배열, 시작인덱스, 끝 인덱스)
        int[] copyArr = Arrays.copyOfRange(arr, 0, arr.length);
        
        // query를 순회해준다.
        for (int i = 0; i < query.length; i++) {
            int queryNum = query[i]; // 퀴리 내부의 idx번호를 담아준다.
            
            // 먼저 i가 짝수인지 홀수인지 판별
            // 짝수인 경우 인덱스까지는 포함해서 배열 복사
            if (i % 2 == 0) {
                copyArr = Arrays.copyOfRange(copyArr, 0, queryNum + 1);
                // 홀수인 경우 인덱스 이후부터 끝까지 배열 복사
            } else {
                copyArr = Arrays.copyOfRange(copyArr, queryNum, copyArr.length);
            }
        }
        
        return copyArr;
    }
}