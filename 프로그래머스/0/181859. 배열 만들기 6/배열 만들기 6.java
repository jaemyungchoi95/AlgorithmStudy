import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        Stack<Integer> stk = new Stack<>();
        int i = 0; // i의 초기값은 0
        
        // i가 arr의 길이보다 작을때까지 반복하면서
        while(i < arr.length) {
            // stk가 빈 배열일 경우
            if (stk.isEmpty()) {
                stk.push(arr[i]);
            } else {
                // stk의 마지막 원소가 arr[i]와 같으면 마지막을 빼고 다르면 마지막에 arr[i]를 더한다
                if (stk.peek() == arr[i]) {
                    stk.pop();
                } else {
                    stk.push(arr[i]);
                }
            }
            // 위의 동작 중 하나를 완료하고 i를 1만큼 더해준다.
            i+=1;
        }
        
        int[] answer = new int[stk.size()];
        for (int k = stk.size() - 1; k >= 0; k--) {
            answer[k] = stk.pop();
        }
        
        if (answer.length == 0) return new int[]{-1};
        
        return answer;
    }
}