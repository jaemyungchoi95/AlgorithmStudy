import java.util.*;

class Solution {
    public int solution(String my_string) {
        int answer = 0;
        List<Character> list = new ArrayList<>();
        
        for (int i = 0; i < my_string.length(); i++) {
            list.add(my_string.charAt(i));
        }
        
        for (int i = 0; i < list.size(); i++) {
            int tmpNum = (int)list.get(i);

            if (tmpNum > 48 && tmpNum < 58) {
                answer += (tmpNum-48);
            }
        }
        
        return answer;
    }
}