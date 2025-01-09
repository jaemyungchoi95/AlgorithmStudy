function solution(name, yearning, photo) {
    var answer = [];
    const scores = new Map([]); // Map을 선언해주고
    
    // 여기에 name, yearning 을 담아준다
    for (let i = 0; i < name.length; i++) {
        scores.set(name[i], yearning[i]);
    }
    
    // photo를 순회하면서 결과값을 answer에 담아준다
    for (let i = 0; i < photo.length; i++) {
        let temp = 0; // 점수를 담아줄 임시변수 선언
        // 2차원 배열에 접근해서
        for (let j = 0; j < photo[i].length; j++) {
            // 임시변수에 텍스트가 일치하는 점수를 찾아 넣어준다
            temp += scores.get(photo[i][j]) ?? 0;
        }
        // 한 배열이 끝나면 answer 배열에 temp값을 넣어준다
        answer.push(temp);
    }
    
    return answer;
}
