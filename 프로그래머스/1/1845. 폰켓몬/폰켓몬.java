import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int count = nums.length/2; // 뽑을 수 있는 횟수
        Set<Integer> reNums = new HashSet();
        
        for (int i = 0; i < nums.length; i++) {
            reNums.add(nums[i]);
        }
        
        return (int) Math.min(count, reNums.size());
    }
}