import java.util.*;

class Solution {
    public String solution(String code) {
        StringBuilder sb = new StringBuilder("");
        boolean mode = true; // 1을 만나는지에 따라 모드를 boolean으로 관리
        
        // 문자열을 순회해주면서
        for (int i = 0; i < code.length(); i++) {
            char tmpStr = code.charAt(i);
            // 먼저 모드 체크 후 모드라면 변경해준다.
            if (tmpStr == '1') {
                if (mode) {
                    mode = false;
                } else {
                    mode = true;
                }
                // 모드가 바뀐상황이라면 continue로 넘어가준다.
                continue;
            }
            
            // mode가 0이라면
            if (mode) {
                if (i%2 == 0) sb.append(tmpStr);
                // mode가 1이라면
            } else {
                if (i%2 == 1) sb.append(tmpStr);                
            }
        }
        
        // 만약 아무 글자도 담기지 못했다면 EMPTY를 반환한다.
        if (sb.length() == 0) {
            return "EMPTY";
        } else {
            return sb.toString();
        }
        
    }
}