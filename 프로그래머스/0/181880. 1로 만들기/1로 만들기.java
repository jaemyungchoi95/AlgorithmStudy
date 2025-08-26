class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        // 홀수면 -1 하고 나누는것까지 같이 횟수가 한번이다
        // 짝수면 반으로 나눈다
        
        for (int i = 0; i < num_list.length; i++) {
            int tmpNum = num_list[i];
            
            while (tmpNum > 1) {
                // 짝수일 경우
                if (tmpNum%2 == 0) {
                    tmpNum/=2;
                } else {
                    tmpNum-=1;
                    tmpNum/=2;
                }
                answer++;
            }
        }
        
        return answer;
    }
}