function solution(array, commands) {
    var answer = [];
    // commands에 주어진 횟수만큼을 반복하며
    for (i = 0; i < commands.length; i++) {
        // 반복시마다 commands내의 범위만큼 잘라낸 임시 배열을 생성해준다
        let tempArr = array.slice(commands[i][0]-1, commands[i][1]);
        // 임시배열을 오름차순으로 정렬 후
        tempArr.sort((a, b) => (a-b))
        // answer 배열에 지정된 자릿수를 담아준다
        answer.push(tempArr[commands[i][2]-1]);
    }
    return answer;
}