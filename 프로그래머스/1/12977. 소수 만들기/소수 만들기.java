import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int leng = nums.length;
        List<Integer> arr = new ArrayList<>();
        
        for (int i = 0; i < leng; i++) {
            for (int j = i+1; j < leng; j++) {
                for (int k = j+1; k < leng; k++) {
                    arr.add(nums[i] + nums[j] + nums[k]);
                }
            }
        }
        
        for (int i = 0; i < arr.size(); i++) {
            int tempNum = 0;
            for (int j = 2; j <= arr.get(i); j++) {
                if (arr.get(i)%j == 0) {
                    tempNum++;
                }
            }
            
            if (tempNum == 1) {
                answer++;
            }
        }

        return answer;
    }
}