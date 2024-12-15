function solution(arr1, arr2) {
    var answer = [];
    
    // 1차원 배열을 순회
    for (i = 0; i < arr1.length; i++) {
        let tempArr = []; // 계산결과를 담아줄 임시 배열 선언
        // 2차원 배열을 순회
        for (j = 0; j < arr1[i].length; j++) {
            // 그 값을 임시 배열에 담아준다.
            tempArr.push(arr1[i][j] + arr2[i][j]);
        }
        // 임시배열에 담긴 2차원 배열의 합산값을 answer 배열에 추가해준다.
        answer.push(tempArr);
    }

    return answer;
}