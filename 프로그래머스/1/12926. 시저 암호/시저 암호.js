function solution(s, n) {
    var answer = '';
    
    // 반복문을 통해 s 문자열을 순회하며
    for (i = 0; i < s.length; i++) {
        // 만약 문자의 아스키코드가 소문자라면
        if (s[i].charCodeAt() >= 97 && s[i].charCodeAt() <= 122) {
            answer += String.fromCharCode((s[i].charCodeAt() - 97 + n) % 26 + 97);
        } else if (s[i].charCodeAt() >= 65 && s[i].charCodeAt() <= 90) { // 대문자라면
            answer += String.fromCharCode((s[i].charCodeAt() - 65 + n) % 26 + 65);
        } else {
            answer += s[i];
        }
    }
    
    return answer;
}