function solution(number, limit, power) {
    var answer = 0;
    
    // number를 구성하는 수를 탐색하면서
    for (let i = 1; i <= number; i++) {
        let tempCnt = 0; // 돌때마다 활용할 임시변수를 선언해준다
        // i에 해당하는 수의 약수를 구하기 위해 제곱근만큼만 탐색한다
        for (let j = 1; j <= i**0.5; j++) {
            if (i%j === 0) { // 약수를 판별하여 임시변수에 담아준다
                tempCnt++;
                if (j != Math.floor(i / j)) { // 약수가 제곱근이 아니면 하나 더 담아준다
                    tempCnt++;
                }
            }
        }
        // 만약 제한을 초과한 공격력이 있다면 정해진 수치로 대입해준다
        if (tempCnt > limit) {
            tempCnt = power;
        }
        // 한 사이클이 끝나면 정답에 더해준다
        answer += tempCnt;
    }
    return answer;
}