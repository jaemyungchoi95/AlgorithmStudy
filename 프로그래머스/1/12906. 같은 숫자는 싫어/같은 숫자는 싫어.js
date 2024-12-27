function solution(arr)
{
    // arr 배열의 0번 인덱스 값을 answer 배열의 초기값으로 설정해준다
    var answer = [arr[0]];

    // arr 배열을 순회하면서
    for (i = 1; i < arr.length; i++) {
        // 만약 arr 배열의 이전값과 현재값이 다르다면 answer 배열에 arr[i] 값을 넣어준다
        if (arr[i-1] !== arr[i]) {
            answer.push(arr[i])   
        }
    }
    
    return answer;
}