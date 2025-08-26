import java.util.*;

class Solution {
    public int[] solution(int[] arr, boolean[] flag) {
        Deque<Integer> dq = new ArrayDeque<>();
        
        for (int i = 0; i < arr.length; i++) {
            if (flag[i]) {
                int num = arr[i];
                for (int j = 0; j < arr[i]*2; j++) {
                    dq.addLast(num);
                }
            } else if (!flag[i]) {
                for (int j = 0; j < arr[i]; j++) {
                    dq.pollLast();
                }
            }
        }
        
        return dq.stream().mapToInt(Integer::intValue).toArray();
    }
}