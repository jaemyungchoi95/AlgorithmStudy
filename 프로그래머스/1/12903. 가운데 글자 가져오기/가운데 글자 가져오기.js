function solution(s) {
    var answer = '';
    var half = Math.floor(s.length/2);
    
    if (s.length%2 === 0) {
        answer += s[half-1] + s[half];
    } else {
        answer += s[half];
    }
    
    return answer;
}