import java.util.*;

class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        List<Integer> answer = new ArrayList<>();
        
        int a = 0;
        int b = num_list.length;
        int c = 1;
        
        if (n == 1) {
            b = slicer[1]+1;
        }
        if (n == 2) {
            a = slicer[0];
        }
        if (n == 3) {
            a = slicer[0];
            b = slicer[1]+1;
        }
        if (n == 4) {
            a = slicer[0];
            b = slicer[1]+1;
            c = slicer[2];
        }
        
        
        for (int i = a; i < b; i+=c) {
            answer.add(num_list[i]);
        }
        
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}