function solution(s) {
    var answer = '';
    var tempArr = [...s]; // 스프레드 연산자를 사용하여 문자열을 담아줄 임시 배열 선언
    
    // 반복문을 통해 tempArr의 문자 요소들을 전부 ASCII 코드로 변경
    for (i = 0; i < tempArr.length; i++) {
        tempArr[i] = tempArr[i].charCodeAt();
    };
    
    // tempArr을 내림차순으로 정렬
    tempArr.sort(function(a,b) {
                 return b - a;
            });
    
    // 반복문을 통해 재정렬된 tempArr을 answer 문자열에 더해줌
    for (i = 0; i < tempArr.length; i++) {
        answer += String.fromCharCode(tempArr[i])
    };
    
    return answer;
}