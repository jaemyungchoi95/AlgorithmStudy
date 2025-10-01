import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int n = queries.length;
        int[] answer = Arrays.copyOf(arr, arr.length);;
        
        for (int t=0; t < n; t++) {
            int i = queries[t][0]; // 바꿀 숫자 1
            int j = queries[t][1]; // 바꿀 숫자 2
            int tmp = answer[i];
            answer[i] = answer[j];
            answer[j] = tmp;
        }
        
        return answer;
    }
}