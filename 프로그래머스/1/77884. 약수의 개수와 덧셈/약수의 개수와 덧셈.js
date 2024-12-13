function solution(left, right) {
    var answer = 0;
    var temp = 0; // 약수 갯수 임시 카운팅을 위한 변수 선언

    // 약수 갯수를 파악해야 하는 숫자 범위만큼 돌면서
    for (i = left; i <= right; i++) {
        // 숫자 하나하나의 약수를 파악하기 위해 완전 탐색
        for (j = 1; j <= i; j++) {
            //만약 약수에 해당하면 temp 더해줌
            if (i%j == 0) temp++;
        }
        // 한 숫자마다 약수의 갯수가 짝수인지 홀수인지 판단하여
        if (temp%2 == 0) {
            // 짝수라면 해당 수를 더해주고
            answer += i;
        } else {
            // 홀수라면 해당 수를 빼준다.
            answer -= i;
        }
        // 한개 숫자의 파악이 끝나면 다시 temp는 0으로 초기화
        temp = 0;
    }
    
    return answer;
}
