function solution(s) {
    var answer = [];
    var arr = s.split(" ") // 문자열 s를 공백으로 구분하여 배열화 시켜줌
    
    for (i = 0; i < arr.length; i++) {
        let tempword = '' // 변환된 단어를 임시로 담아줄 단어 선언
        for (j = 0; j < arr[i].length; j++) {
            if (j%2 === 0) { // 문자열의 인덱스가 짝수이면 대문자로
                tempword += arr[i][j].toUpperCase();
            } else { // 홀수이면 소문자로 임시변수에 담아줌
                tempword += arr[i][j].toLowerCase();
            }
        }
        answer.push(tempword); // 담긴 임시변수를 answer 배열에 추가
    }
    
    return answer.join(" "); // 배열값을 공백으로 구분하여 반환
}