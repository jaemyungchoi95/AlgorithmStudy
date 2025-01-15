import java.util.*;

class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        Arrays.sort(score); // 배열을 오름차순 정렬
        
        // 오름차순 배열을 역순으로 탐색하면서
        for (int i = score.length-m; i >= 0; i -= m) {
            // 해당 위치의 점수를 박스에 들어가는 사과의 수만큼 곱하여 더해준다
            answer += score[i] * m; 
        }
        
        return answer;
    }
}