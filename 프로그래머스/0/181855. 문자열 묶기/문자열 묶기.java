import java.util.*;

class Solution {
    public int solution(String[] strArr) {
        int[] answer = new int[31];
        
        for (int i = 0; i < strArr.length; i++) {
            answer[strArr[i].length()]++;
        }
        
        return Arrays.stream(answer).max().getAsInt();
    }
}