class Solution {
    public int solution(int n, int m, int[] section) {
        int count = 0; // 칠 횟수 카운트
        int location = 0; // 롤러 위치
        
        // section을 탐색하면서
        for (int i : section) {
            // 롤러의 위치보다 보수해야 할 위치가 뒤에있으면
            if (i > location) {
                count++; // 칠 횟수를 증가시키고
                location = i + m - 1; // 롤러의 위치 업데이트
            }
        }
        return count;
    }
}