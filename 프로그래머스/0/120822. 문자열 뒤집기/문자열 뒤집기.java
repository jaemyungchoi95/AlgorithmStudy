import java.util.Arrays;

class Solution {
    public String solution(String my_string) {
        int leng = my_string.length();
        String[] tempArr = new String[leng];
        tempArr = my_string.split("");
        String[] reverseArr = new String[leng];
        
        for (int i = 0 ; i < leng ; i++) {
            reverseArr[i] = tempArr[(leng-1)-i];
        }
        
        String answer = String.join("",reverseArr);
       
        return answer;
    }
}