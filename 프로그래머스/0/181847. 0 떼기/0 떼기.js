function solution(n_str) {
    var answer = '';
    let isTrue = false;
    
    for (let i = 0; i < n_str.length; i++) {
        if (!isTrue && n_str[i] === '0') {
            continue;
        } else {
            isTrue = true;
        }
        
        if (isTrue) answer += n_str[i];
    }
    
    return answer;
}