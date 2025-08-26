import java.util.*;

class Solution {
    public String[] solution(String myStr) {
        StringBuilder sb = new StringBuilder();
        List<String> answer = new ArrayList<>();
        
        for (int i = 0; i < myStr.length(); i++) {
            char ch = myStr.charAt(i);
            if (ch == 'a' || ch == 'b' || ch == 'c') {
                if (sb.length() > 0) {
                    answer.add(sb.toString());
                    sb.setLength(0);
                }
            } else {
                sb.append(ch);
            }    
        }
        
        if (sb.length() > 0) answer.add(sb.toString());
        
        if (answer.isEmpty()) return new String[]{"EMPTY"};

        return answer.toArray(new String[answer.size()]);
    }
}