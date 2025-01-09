import java.util.*;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        HashMap<String, Integer> scores = new HashMap<>(); // 이름과 점수를 담을 해시맵을 선언
        
        // 해시맵 score에 값을 넣어준다
        for (int i = 0; i < name.length; i++) {
            scores.put(name[i], yearning[i]);
        }
        
        // photo를 순회하면서
        for (int i = 0; i < photo.length; i++) {
            int temp = 0; // 한 항목마다 점수를 누적해줄 임시변수 선언
            // 각 photo의 2차원배열 원소에 접근
            for (int j = 0; j < photo[i].length; j++) {
                temp += scores.getOrDefault(photo[i][j], 0);
            }
            // 한 사이클이 끝나면 누적된 점수를 answer 배열에 담아준다
            answer[i] = temp;
        }
        return answer;
    }
}