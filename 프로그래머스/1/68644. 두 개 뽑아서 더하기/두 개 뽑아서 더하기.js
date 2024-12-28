function solution(numbers) {
    var answer = [];
    const length = numbers.length
    
    // 서로 다른 두 수를 뽑아주면서
    for (i = 0; i < length; i++) {
        for (j = i+1; j < length; j++) {
            // 만약 answer 배열에 두 수를 더한 값이 없다면
            if (!answer.includes(numbers[i] + numbers[j])) {
                // answer 배열에 두 수를 더한 값을 추가한다.
                answer.push(numbers[i] + numbers[j])
            }
        }
    }
    // answer 배열을 오름차순 정렬하여 반환
    return answer.sort((a,b) => (a-b));
}