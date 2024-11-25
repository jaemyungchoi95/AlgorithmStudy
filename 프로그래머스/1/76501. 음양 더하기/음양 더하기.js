function solution(absolutes, signs) {
    // answer의 값을 0으로 초기화
    var answer = 0;
    
    // 배열의 길이만큼 돌면서
    for (i = 0; i < absolutes.length; i++) {
        // signs의 i번째 텍스트가 false면 absolutes의 i번째 숫자를 빼고, 그렇지 않으면 더해준다.
        let value = (signs[i].toString() === "false") ? answer -= absolutes[i] : answer += absolutes[i]
    }
    
    return answer;
}