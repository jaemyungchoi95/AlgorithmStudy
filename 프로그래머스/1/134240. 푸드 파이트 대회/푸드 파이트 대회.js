function solution(food) {
    var answer = '';
    var tempArr = []; // 임시배열 선언
    
    // 1부터 food의 길이만큼 반복하면서
    for (i = 1; i < food.length; i++) {
        // 임시배열에 food의 필요한 갯수를 나눈 몫을 저장해준다.
        tempArr.push(Math.floor(food[i]/2));
    }
    
    // tempArr의 배열을 탐색하면서
    for (i = 0; i < tempArr.length; i++) {
        // 만약 tempArr의 i번 인덱스의 숫자가 0보다 크다면
        if (tempArr[i] > 0) {
            // tempArr의 i번 인덱스의 숫자만큼 반복하면서
            for (j = 0; j < tempArr[i]; j++) {
                answer += (i+1); // answer에 i번인덱스 + 1의 숫자를 더해준다
            }
        }
    }
    // 모든 반복이 종료되었다면 answer 문자열에 0과 반전시킨 answer 문자열을 더해준다
    answer += "0" + answer.split("").reverse().join("");
    
    return answer;
}