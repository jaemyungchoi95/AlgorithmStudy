function solution(n) {
    var answer = "";
    
    // 10진수 -> 3진수 변환
    while (n > 0) { // n이 1보다 클 동안 반복해주면서
        answer += (n % 3).toString(); // 임시 문자변수에 n을 3으로 나눈 나머지값을 answer에 더해줌
        n = Math.floor(n / 3); // n의 값은 3으로 나눈 몫으로 업데이트 해줌
    }
    
    return parseInt(answer, 3); // 3진수로 쓰여진 숫자를 10진수로 변환하여 반환
}