function solution(sizes) {
    const sArr = []; // 작은 길이 배열
    const bArr = []; // 큰 길이 배열
    
    // 1차원 배열을 탐색하면서
    for (i = 0; i < sizes.length; i++) {
        // 2차원 배열의 원소 크기를 비교해서 큰 값은 bArr, 작은 값은 sArr에 담아준다.
        if (sizes[i][0] > sizes[i][1]) { // 0번 인덱스의 값이 클 경우
            bArr.push(sizes[i][0]);
            sArr.push(sizes[i][1]);
        } else {  // 그렇지 않은 경우
            bArr.push(sizes[i][1]);
            sArr.push(sizes[i][0]);
        }
    }
    
    // 각 배열의 최대값을 구하여 곱해주기
    return Math.max(...sArr) * Math.max(...bArr);
}