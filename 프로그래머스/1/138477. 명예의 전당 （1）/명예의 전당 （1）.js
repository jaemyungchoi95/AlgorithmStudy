function solution(k, score) {
    var answer = [];
    var tempArr = [] // 임시배열
    
    // 점수를 순회하면서
    for (let i  = 0; i < score.length; i++) {
        if (tempArr.length < k) { // 만약 임시배열의 길이가 k 미만이면
            tempArr.push(score[i]) // tempArr에 값을 담아준다.
        } else if (tempArr.length === k) { // 임시배열의 길이가 k에 도달하면
            // 그리고 현재까지 담겨진 임시배열의 최소값보다 i가 크면
            if (Math.min(...tempArr) < score[i]) { 
                tempArr.sort((a,b) => (a-b)) // 오름차순으로 정렬 후
                tempArr.shift() // 첫번째 최저값을 빼고
                tempArr.push(score[i]) // 새로운 i값을 다시 담아준다.
            }
        }
        answer.push(Math.min(...tempArr)); // 임시배열의 최솟값을 결과 배열에 추가
    }
    return answer;
}