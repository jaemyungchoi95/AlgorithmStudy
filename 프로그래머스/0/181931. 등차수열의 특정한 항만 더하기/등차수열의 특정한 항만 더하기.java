class Solution {
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;
        int n = included.length; // 등차수열의 길이 n
        int subtotal = a; // 누적합을 담아줄 변수 선언
        
        for (int i = 1; i < n; i++) {
            subtotal += d;
            if (included[i]) {
                answer += subtotal;
            }
        }
        
        if (included[0]) answer += a;
        
        
        return answer;
    }
}