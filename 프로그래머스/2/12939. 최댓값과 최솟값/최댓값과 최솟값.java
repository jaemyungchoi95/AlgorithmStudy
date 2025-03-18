import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        String[] str = s.split(" ");
        ArrayList<Integer> tmp = new ArrayList<>();
        
        for (String i : str){
            tmp.add(Integer.parseInt(i));
        }
        
        int min = Collections.min(tmp);
        int max = Collections.max(tmp);
        
        answer = Integer.toString(min) + " " + Integer.toString(max);
        return answer;
    }
}