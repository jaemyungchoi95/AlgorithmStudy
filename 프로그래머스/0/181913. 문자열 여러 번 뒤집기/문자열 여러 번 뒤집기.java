import java.util.*;

class Solution {
    public String solution(String my_string, int[][] queries) {
        String[] answer = my_string.split("");
        
        for (int i = 0; i < queries.length; i++) {
            int s = queries[i][0];
            int e = queries[i][1];
            int size = e-s+1;
            
            for (int j = 0; j < size/2; j++) {
                String tmpStr = answer[s+j];
                answer[s+j] = answer[e-j];
                answer[e-j] = tmpStr;
            }
        }
        
        return String.join("", answer);
    }
}