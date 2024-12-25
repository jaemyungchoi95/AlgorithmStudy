function solution(t, p) {
    var answer = 0;
    const length = t.length - p.length
    
    for (i = 0; i <= length; i++) {
        if (parseInt(t.substr(i, p.length)) <= parseInt(p)) {
            answer++;
        }
    }
    
    return answer;
}