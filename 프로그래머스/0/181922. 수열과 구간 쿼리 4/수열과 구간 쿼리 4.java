class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int n = queries.length; // 쿼리의 길이 n
        int[] answer = {};
        
        for (int i = 0; i < n; i++) {
            int s = queries[i][0];
            int e = queries[i][1];
            int k = queries[i][2];
            
            for (int j = s; j <= e; j++) {
                if (j%k == 0) {
                    arr[j]++;
                }
            }
        }
        
        return arr;
    }
}