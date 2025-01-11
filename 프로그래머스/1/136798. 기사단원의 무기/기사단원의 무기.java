class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        
        for (int i = 1; i <= number; i++) {
            int tempCnt = 0;
            
            for (int j = 1; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    tempCnt++;
                    if (j != Math.floor(i / j)) {
                        tempCnt++;
                    }
                }
            }
            
            if (tempCnt > limit) {
                answer += power;
            } else {
                answer += tempCnt;
            }
        }
        
        return answer;
    }
}