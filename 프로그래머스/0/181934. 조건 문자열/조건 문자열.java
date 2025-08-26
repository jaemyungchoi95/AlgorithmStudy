class Solution {
    public int solution(String ineq, String eq, int n, int m) {
        // n에서 m을 뺀 결과를 먼저 받아준다
        int result = n - m;
        
        // 만약 결과가 0이고 eq가 = 라면 1 반환
        if (result == 0 && eq.equals("=")) {
            return 1;
        }
        
        // result가 음수라면 n이 작은것
        if (result < 0) {
            if (ineq.equals("<")) {
                return 1;
            } else {
                return 0;
            }
        }
        
        if (result > 0) {
            if (ineq.equals("<")) {
                return 0;
            } else {
                return 1;
            }
        }
        return 0;
    }
}