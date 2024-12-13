function solution(s) {
    // 숫자만 포함하는지 확인하는 정규식을 통하여 숫자여부 확인
    return /^[0-9]+$/.test(s) && (s.length === 4 || s.length === 6);
}