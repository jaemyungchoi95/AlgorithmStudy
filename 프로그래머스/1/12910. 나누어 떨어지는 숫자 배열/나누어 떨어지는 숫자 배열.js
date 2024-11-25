function solution(arr, divisor) {
    var answer = [];
    
    // 나누어떨어지는 값 판별을 위한 반복문
    for (i = 0; i<arr.length; i++) {
        if(arr[i]%divisor === 0) {
            answer.push(arr[i]);
        }
    }
    
    // 배열에 아무것도 담기지 않으면 -1를 담아줌
    if(answer.length === 0) {
        answer.push(-1)
    }
    
    // 배열을 오름차순으로 정렬
    answer.sort(function(a, b) {
        return a - b;
    })
    
    return answer;
}