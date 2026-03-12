import java.util.*;

class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        int answer = 0;
        int size = 0;
        
        // 대회참석이 가능한 학생 수를 추출하여 size 변수에 담아준다.
        for (int i = 0; i < attendance.length; i++) {
            if (attendance[i]) size++;
        }
        
        // 현재 기준으로 가능한 학생들의 정보를 available 배열에 담아준다.
        int[][] available = new int[size][2];
        int idx = 0;
        for (int i = 0; i < rank.length; i++) {
            if (attendance[i]) {
                available[idx][0] = rank[i]; // 0번 인덱스에서는 등수
                available[idx][1] = i; // 1번 인덱스에서는 인덱스 값을 담아준다.
                idx++;
            }
        }
        
        // available 배열의 학생들을 등수 순서대로 다시 정렬해준다.
        Arrays.sort(available, (e1, e2) -> {
            return e1[0] - e2[0];
        });
        
        int[] multi = {10000, 100, 1};
        
        // 3등까지만 규칙에 의해서 추가연산 후 answer에 담아준다.
        for (int i = 0; i < 3; i++) {
            answer += available[i][1] * multi[i];
        }
        
        return answer;
    }
}