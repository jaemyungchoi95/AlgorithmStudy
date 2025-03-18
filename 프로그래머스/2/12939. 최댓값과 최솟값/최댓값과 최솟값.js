function solution(s) {
    let nums = s.split(" ").map(Number); // 문자열을 Number 타입으로 바꿔서 변수에 저장
    return Math.min(...nums) + " " + Math.max(...nums); // 최소값 + " " + 최대값 반환
}