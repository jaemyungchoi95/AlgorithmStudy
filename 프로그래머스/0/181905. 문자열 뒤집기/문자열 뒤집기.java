import java.util.*;

class Solution {
    public String solution(String my_string, int s, int e) {
        String[] tmpStr = my_string.split("");
        
        StringBuffer sb = new StringBuffer(my_string.substring(s, e+1));
        sb.reverse();
        
        for (int i = s; i < e+1; i++) {
            tmpStr[i] = String.valueOf(sb.charAt(i-s));
        }
        
        return String.join("", tmpStr);
    }
}