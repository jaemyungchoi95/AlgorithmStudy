class Solution {
    public double solution(int[] numbers) {
        double answer = 0;
        double subTotal = 0;
        
        for (int i = 0 ; i < numbers.length ; i++) {
            subTotal += numbers[i];
        }
        answer = subTotal/numbers.length;
        
        return answer;
    }
}