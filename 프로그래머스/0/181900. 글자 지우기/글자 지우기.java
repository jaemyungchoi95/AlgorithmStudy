class Solution {
    public String solution(String my_string, int[] indices) {
        String answer = "";
        
        String[] tmpStr = my_string.split("");
        
        for (int i = 0; i < indices.length; i++) {
            tmpStr[indices[i]] = "";
        }

        for (int i = 0; i < tmpStr.length; i++) {
            answer += tmpStr[i];
        }
        
        return answer;
    }
}