function solution(babbling) {
    const possible = ["aya", "ye", "woo", "ma"]; // 발음 가능한 단어를 배열에 넣어준다
    let count = 0; // 갯수 카운트

    // babbling 배열을 탐색하면서
    for (let word of babbling) {
        let isInvalid = false; // 유효성 체크하는 임시 변수 선언

        // possible 배열의 단어들 중 연속된 발음이 있는지 먼저 체크
        for (let able of possible) {
            if (word.includes(able.repeat(2))) {
                isInvalid = true; // 있으면 유효하지 않도록 상태 true로 변경
                break;
            }
        }
        
        // isInvalid가 true이면 다음 단어로 넘어가서 반복문을 다시 수행
        if (isInvalid) continue;

        // possible 배열의 단어 중 발음 가능한 단어를 모두 제거
        for (let able of possible) {
            word = word.replaceAll(able, " "); // 모든 발음을 공백으로 변경
        }

        // 남은 단어가 공백이면 카운트 증가
        if (word.trim() === "") {
            count++;
        }
    }

    return count;
}