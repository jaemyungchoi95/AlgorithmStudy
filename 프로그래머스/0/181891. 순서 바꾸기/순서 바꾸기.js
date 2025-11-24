function solution(num_list, n) {
    var answer = [];
    let idx = 0;
    
    // n번째 원소 이후의 원소들
    for (let i = n; i < num_list.length; i++) {
        answer[idx++] = num_list[i];
    }
    // n번째 원소 이전의 원소들
    for (let i = 0; i < n; i++) {
        answer[idx++] = num_list[i];
    }
    
    return answer;
}