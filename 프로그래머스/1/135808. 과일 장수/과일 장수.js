function solution(k, m, score) {
    var answer = 0;
    score.sort((a,b) => (b-a)); //배열을 내림차순으로 정렬 
    
    // 내림차순 정렬된 배열에서 가장 작은수의 인덱스를 갯수단위로 순회하면서
    for (let i = m-1; i < score.length; i += m) {
        answer += score[i] * m; // 해당 사과의 가격을 한박스당 숫자에 곱하여 계산
    }
    
    return answer;
}