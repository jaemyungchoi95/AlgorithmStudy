function solution(d, budget) {
    var answer = 0;
    
    // d 배열을 오름차순으로 정렬
    d.sort(function(a, b) {return a-b})
    
    // 오름차순 배열을 순회하면서 
    for (i = 0; i < d.length; i++) {
        // 변수 d의 i번째 요청 예산이 budget보다 작아질때까지 빼준다
        if (budget >= d[i] ) {
            budget -= d[i];
            answer += 1;
        } else { // d[i] 보다 변수가 작아지면 반복분을 빠져나온다
            break;
        }   
    }
    return answer;
}