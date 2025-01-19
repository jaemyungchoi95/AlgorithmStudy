function solution(N, stages) {
    var answer = [];
    var length = stages.length;
    
    // 1부터 N까지 스테이지를 하나씩 살펴보며
    for (let i = 1; i <= N; i++) {
        // 아직 클리어하지 못한 플레이어의 수 세기
        let count = stages.filter(stage => stage === i).length;
        // 실패율 계산
        let fail = length === 0 ? 0 : count / length;
        // 다음 스테이지에 도달한 플레이어의 수 계산
        length -= count;
        // 배열에 (스테이지 번호, 실패율) 추가
        answer.push([i, fail]);
    }
    // 실패율 내림차순을 기준으로 정렬 (실패율이 같다면 스테이지 번호 오름차순)
    answer.sort((a, b) => b[1] - a[1] || a[0] - b[0])

    // 내림차순으로 정렬된 스테이지 번호 반환
    return answer.map(item => item[0]);
}