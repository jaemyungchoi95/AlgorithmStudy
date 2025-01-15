function solution(nums) {
    var answer = 0;
    const leng = nums.length;
    var tempArr = [];
    
    for (let i = 0; i < leng; i++) {
        for (let j = i+1; j < leng; j++) {
            for (let k = j+1; k < leng; k++) {
                tempArr.push(nums[i] + nums[j] + nums[k]);
            }
        }
    }
    
    // 경우의 수 배열을 탐색하면서
    for (let i = 0; i < tempArr.length; i++) {
        let tempNum = 0; // 각 탐색마다 임시변수를 선언 후
        // 소수를 판별하기 위해 2 ~ i만큼 탐색하면서
        for (let j = 2; j <= tempArr[i]; j++) {
            // 약수를 판별하여 갯수를 더해준다
            if (tempArr[i]%j === 0) {
                tempNum++;
            }
        }
        // 만약 약수의 갯수가 1개이면 정답에 더해준다
        if (tempNum === 1) {
            answer++;
        }
    }
    
    return answer;
}