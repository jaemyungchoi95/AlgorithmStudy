class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        // 전체 문자열에서 문자열 탐색을 비교할 반복횟수 계산
        int moveCnt = myString.length() - pat.length() + 1;
        
        // 반복문을 통해 검사해야하는데
        for (int i = 0; i < moveCnt; i++) {
            int tmpCnt = 0;
            for (int j = 0; j < pat.length(); j++) {
                if (pat.charAt(j) != myString.charAt(i+j)) continue;
                tmpCnt++;
            }
            
            if (tmpCnt == pat.length()) answer++;
        }
        
        return answer;
    }
}