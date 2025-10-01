import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        Stack<Integer> stk = new Stack<>();
        int i = 0; // i의 초기값은 0
        
        // i가 arr의 길이보다 작으면 다음 작업들을 반복
        while (i < arr.length) {
            // 만약 stk가 빈 배열이라면
            if (stk.isEmpty()) {
                stk.push(arr[i]); // stk에 arr[i]를 추가하고
                i += 1; // i에 1을 더합니다.
            } else {
                // stk의 마지막 원소가 arr[i]보다 작으면
                if (stk.peek() < arr[i]) {
                    stk.push(arr[i]); // stk의 뒤에 추가하고
                    i += 1; // 1을 더해준다.
                } else {
                    stk.pop(); // stk에서 원소를 제거합니다.
                }
            }
        }
        
        int[] answer = new int[stk.size()];
        
        for (int j = stk.size() - 1; j >= 0; j--) {
            answer[j] = stk.pop();
        }
        
        return answer;
    }
}