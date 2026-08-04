class Solution {
    public int solution(int slice, int n) {
        if (n < slice) {
            return 1;
        } else if (n > slice && n%slice > 0) {
            return (n/slice)+1;
        } else {
            return n/slice;
        }
    }
}