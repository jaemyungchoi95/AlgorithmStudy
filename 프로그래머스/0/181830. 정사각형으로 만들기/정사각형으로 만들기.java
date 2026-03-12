import java.util.*;

class Solution {
    public int[][] solution(int[][] arr) {
        int row = arr.length; // 행의 개수
        int col = arr[0].length; // 열의 개수
        int size = row > col ? row : col; // 행과 열 중 더 큰 수를 사이즈로 지정한다.

        // answer 배열을 초기화 해준다.
        int[][] answer = new int[size][size];
        
        // answer 배열에 arr 배열의 값을 입력해준다.
        for (int i = 0; i< row; i++) {
            for (int j = 0; j < col; j++) {
                answer[i][j] = arr[i][j];
            }
        }
        
        return answer;
    }
}