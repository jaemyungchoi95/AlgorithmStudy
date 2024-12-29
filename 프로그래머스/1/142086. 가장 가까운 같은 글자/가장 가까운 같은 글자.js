function solution(s) {
    var answer = [];
    var tempArr = []; // 문자열을 담아줄 임시 열
    
    // 문자열 s를 순회하면서
    for (i = 0; i < s.length; i++) {
        if (!tempArr.includes(s[i])) {
            tempArr.push(s[i])
            answer.push(-1)
        } else {
            let lastIdx = s.lastIndexOf(s[i], i - 1);
            answer.push(i - lastIdx)
        }
    }
    
    return answer;
}