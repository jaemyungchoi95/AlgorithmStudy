function solution(num) {
    var answer = 0;
    
    // num이 1이 될때까지 반복하는데
    while(num != 1) {
        // num이 짝수이면 2로 나누어주고 그렇지 않으면 (홀수이면) 3을 곱하고 1을 더해준다.
        if (num%2 === 0) {
            num = num/2;
        } else {
            num = num*3 + 1;
        }
        // 작업횟수 카운트
        answer++;    
    }
    
    // 만약 500회가 넘어가면 -1을 반환
    if (answer > 500) return -1;
    
    return answer;
}