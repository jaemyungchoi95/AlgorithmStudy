function solution(n, arr1, arr2) {
    var answer = [];
    var tempArr = []; // 임시배열 선언
    var tempArr2 = []; // 임시배열 선언 2
    
    // 배열들을 순회하면서
    for (let i = 0; i < n; i++) {
        // arr1의 10진수들을 2진수로 변환 후 길이를 n으로 맞추어 tempArr에 저장
        tempArr.push(arr1[i].toString(2).padStart(n, 0))
        // arr2의 경우도 마찬가지로 tempArr2에 저장
        tempArr2.push(arr2[i].toString(2).padStart(n, 0))
    }
    
    // tempArr와 tempArr2의 배열을 순회하면서
    for (let i = 0; i < n; i++) {
        let tempStr = ''; // tempArr 배열의 한 인덱스가 시작될때마다 초기화되도록 임시 문자열 선언
        for (let j = 0; j < n; j++) { //tempArr와 tempArr2의 각 문자열의 자리수를 비교하여
            if (tempArr[i][j] === '1' || tempArr2[i][j] === '1') { // 하나라도 1이면
                tempStr += '#'; // '#'추가
            } else {
                tempStr += ' '; // 그렇지 않으면 공백 추가
            }
        }
        answer.push(tempStr); // 배열의 한 인덱스가 끝날때마다 answer에 결과 저장
    }
    return answer;
}