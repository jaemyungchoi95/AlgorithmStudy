import java.util.*;

class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2]; 
        int maxTile = brown + yellow;
        
        int width = 0; // 가로
        int height = 0; // 세로
        
        // maxTile까지 돌면서 나눠준다
        for (int i = 1; i <= maxTile; i++) {
            // maxTile을 i로 나눴을때 나누어 떨어지면 
            if (maxTile%i == 0) {
                width = maxTile/i; // 가로에 큰값을
                height = i; // 세로에 작은 값을 넣어준다
                
                if ((width - 2) * (height -2) == yellow) {
                    if (width >= height) {
                        answer[0] = width;
                        answer[1] = height;
                    } else {
                        answer[0] = height;
                        answer[1] = width;
                    }
                    break;   
                } 
            }
        }
        return answer;
    }
}