function solution(answers) {
    var giveups = [[1, 2, 3, 4, 5],[2, 1, 2, 3, 2, 4, 2, 5],[3, 3, 1, 1, 2, 2, 4, 4, 5, 5]]; // 수포자들 배열
    var answer = [];
    var scores = [0, 0, 0];
    
    // 수포자들의 배열크기만큼 반복하면서
    for (let i = 0; i < giveups.length; i++) {
        // 한명의 수포자의 스코어가 지날때마다 임시로 중간집계를 해준다
        let tempScore = 0;
        // 각 수포자들의 패턴만큼 반복한다.
        for (let j = 0; j < answers.length; j++) {
            // 수포자의 찍기패턴과 정답순서가 맞으면 임시점수를 더해준다.
            if (answers[j] === giveups[i][j % giveups[i].length]) {
                tempScore++;
            }
        }
        // 한명 수포자에 대한 점수들을 각 인덱스에 담아준다.
        scores[i] += tempScore;
    }
    
    let maxScore = Math.max(...scores); // 최댓값은 따로 변수로 선언
    
    // scores 배열에 max값의 갯수를 조사해서 해당 값을 표시해준다.
    for (let i = 0; i < scores.length; i++) {
        if (scores[i] === maxScore) {
            answer.push(i + 1);
        }
    }


    return answer;
}