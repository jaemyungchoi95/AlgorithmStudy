import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        List<Integer> list = new ArrayList<>();
        
        for (int num : numbers) {
            list.add(num);
        }
        
        Collections.sort(list, Collections.reverseOrder());
        
        return list.get(0) * list.get(1);
    }
}