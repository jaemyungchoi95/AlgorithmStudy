class Solution {
    public int[] solution(long n) {
        String newN = Long.toString(n);
        int[] answer = new int[newN.length()];
        
        for (int i = 0; i < newN.length(); i++) {
            answer[i] = Character.getNumericValue(newN.charAt(newN.length() -1 -i));
        }
        
        return answer;
    }
}