function solution(a, b, n) {
    var answer = 0;
    
    // 빈병의 갯수가 2개 이상일 동안 반복하면서
    while (n >= a) {
        // 교환비에 따라 빈병을 a만큼 주면 콜라를 받는 값을 구해준다.
        let ratio = Math.floor(n/a) * b;
        answer += ratio; // answer 에 교환비에 따라 받는 콜라에 갯수를 더해준다.
        n = ratio + (n%a); // n을 업데이트해준다.
    }
    
    return answer;
}