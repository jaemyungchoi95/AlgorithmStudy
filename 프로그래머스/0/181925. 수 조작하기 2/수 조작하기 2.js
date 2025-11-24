/*
"w" : 수에 1을 더한다.
"s" : 수에 1을 뺀다.
"d" : 수에 10을 더한다.
"a" : 수에 10을 뺀다.
*/

function solution(numLog) {
    var answer = '';
    
    for (let i = 1; i < numLog.length; i++) {
        let prev = numLog[i-1]
        let curr = numLog[i];
        
        if (curr - prev === 1) {
            answer += 'w';
        }
        if (curr - prev === 10) {
            answer += 'd';
        }
        if (curr - prev === -1) {
            answer += 's';
        }
        if (curr - prev === -10) {
            answer += 'a';
        }
    }
    
    return answer;
}

