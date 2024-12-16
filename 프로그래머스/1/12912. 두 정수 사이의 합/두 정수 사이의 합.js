function solution(a, b) {
    var answer = 0;
    var temp = 0;
    
    if (a === b) {
        return a;
    } else if (a > b) {
        temp = a;
        a = b;
        b = temp;
    }
    
    for (i = a; i <= b; i++) {
        answer += i;
    }
    
    return answer;
}