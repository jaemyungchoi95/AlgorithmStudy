import java.util.*;

class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        int idx1 = 0; // cards1의 인덱스 정보 저장
        int idx2 = 0; // cards2의 인덱스 정보 저장
        
        // goal 배열만큼 탐색하면서
        for (int i = 0; i < goal.length; i++) {
            // idx1이 cards1의 길이보다 작으면 goal의 i번 인덱스와 cards1의 idx1번 인덱스를 비교해서
            if (idx1 < cards1.length && goal[i].equals(cards1[idx1])) {
                idx1++; // 같으면 idx1을 증가
            // idx2가 cards2의 길이보다 작으면 goal의 i번 인덱스와 cards2의 idx2번 인덱스를 비교해서
            } else if (idx2 < cards2.length && goal[i].equals(cards2[idx2])) {
                idx2++; // 같으면 idx2를 증가
            } else { // 위의 조건에 해당하지 않으면 'No' 반환하고 끝
                return "No";
            }
        }
        // 전체 조건에 문제가 없었다면 'Yes' 반환
        return "Yes";
    }
}