function solution(left, right) {
    var answer = 0;
    var temp = 0;
    
    for (i = left; i <= right; i++) {
        for (j = 1; j <= i; j++) {
            if (i%j == 0) temp++;
        }
        if (temp%2 == 0) {
            answer += i;
        } else {
            answer -= i;
        }
        temp = 0;
    }
    
    return answer;
}