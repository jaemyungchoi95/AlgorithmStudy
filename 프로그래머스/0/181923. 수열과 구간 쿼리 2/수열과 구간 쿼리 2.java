import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int leng = queries.length;
        int[] answer = new int[leng];
        List<Integer> list = new ArrayList<>();
        
        for (int i = 0; i < leng; i++) {
            int s = queries[i][0]; // 시작점
            int e = queries[i][1]; // 끝점
            int k = queries[i][2]; // 기준 수
            
            for (int j = s; j <= e; j++) {
                if (arr[j] > k) {
                    list.add(arr[j]);
                }
            }
            
            Collections.sort(list);
            
            if (list.size() == 0) {
                answer[i] = -1;
            } else {
                answer[i] = list.get(0);    
            }
            list.clear();
        }
        
        return answer;
    }
}