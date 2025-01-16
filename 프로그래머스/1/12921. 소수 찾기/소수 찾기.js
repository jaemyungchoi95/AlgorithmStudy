function solution(n) {
    var tempArr = [];
    
    // 배열에 boolean값을 넣어준다
    for (let i = 0; i <= n; i++) {
        tempArr.push(true);
    }
    
    // 0과 1은 소수가 아니므로 false를 넣어준다
    tempArr[0] = false;
    tempArr[1] = false;
    
    // 숫자 2부터 제곱근까지 탐색하면서
    for (let i = 2; i <= Math.floor(n**0.5) + 1; i++) {
        // 만약 i가 소수라면
        if (tempArr[i]) {
            // i의 배수들은 전부 false로 처리
            for (let j = i * i; j <= n; j += i) {
                tempArr[j] = false;
            }
        }
    }
    
    // tempArr 배열에서 true의 수를 reduce 함수를 통해 계산
    var answer = tempArr.reduce((a, b) => a + b, 0);

    return answer;
}