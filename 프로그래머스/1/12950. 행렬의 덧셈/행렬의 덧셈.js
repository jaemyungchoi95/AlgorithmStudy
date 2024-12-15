function solution(arr1, arr2) {
    var answer = [];
    
    // 만약 arr의 배열 내부 길이가 각 1일 경우 answer에 배열의 형태로 바로 더해준다.
    if (arr1[0].length == 1) {
        answer.push([parseInt(arr1[0]) + parseInt(arr2[0])])
        answer.push([parseInt(arr1[1]) + parseInt(arr2[1])])
        
    // 배열의 길이가 1 이상인 경우 아래와 같이 담아준다.
    } else {
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
    }
    return answer;
}