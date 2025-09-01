class Solution {
    public int solution(String[] order) {
        int answer = 0;
        
        // 아메리카노 : 4500 , 라떼 : 5000
        // 아무거나 (anything) : 4500
        for (int i = 0; i < order.length; i++) {
            if (order[i].contains("latte")) {
                answer += 5000;
            } else {
                answer += 4500;
            }
        }

        return answer;
    }
}