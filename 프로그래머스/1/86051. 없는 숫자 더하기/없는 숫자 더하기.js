function solution(numbers) {
    var answer = 0;
    // 비교를 위한 0으로 채워진 길이 10짜리 배열 선언
    var temp = new Array(10).fill(0);
    
    // temp 배열에 numbers에 없는 숫자들을 구분하기 위해 반복문으로 숫자를 채워줌
    for (i = 0; i < numbers.length; i++) {
        temp[numbers[i]] += 1;
    }
    
    // temp배열을 돌면서 숫자가 0인 인덱스만큼 answer에 더해줌
    for (i = 0; i < 11; i++) {
        if (temp[i] === 0) answer += i;
    }
    
    return answer;
}