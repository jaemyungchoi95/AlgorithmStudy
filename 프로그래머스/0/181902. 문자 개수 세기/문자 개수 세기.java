class Solution {
    public int[] solution(String my_string) {
        int[] answer = new int[52];
        
        for (int i = 0; i < my_string.length(); i++) {
            int idx = (int)my_string.charAt(i);
            // 대문자일 경우
            if (idx >= 65 && idx <= 90) {
                answer[idx-65]++;
            }
            
            // 소문자의 경우
            if (idx >= 97 && idx <= 122) {
                answer[idx-97+26]++;
            }
        }
        
        return answer;
    }
}