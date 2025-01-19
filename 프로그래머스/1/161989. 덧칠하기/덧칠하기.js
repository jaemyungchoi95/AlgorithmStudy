function solution(n, m, section) {
    var count = 0; // 칠 횟수 카운트
    var location = 0; // 롤러의 마지막 위치
    
    // 칠이 필요한 구역 탐색
    for (let i = 0; i < section.length; i++) {
        // 만약 롤러의 위치보다 칠해야 하는 구역이 더 뒤에있으면 작업한다
        if (section[i] > location) {
            count++; // 칠 횟수 추가
            location = section[i] + m - 1; // 롤러의 마지막 위치 갱신
        }
    }
    
    return count;
}