function solution(cards1, cards2, goal) {
    // goal 배열을 순차적으로 탐색하면서
    for (let i = 0; i < goal.length; i++) {
        // 만약 i가 cards1의 0번 인덱스에 있으면 cards1의 0번 인덱스를 빼주고
        if (goal[i] == cards1[0]) {
            cards1.shift();
            // 만약 i가 cards2에 있으면 cards2의 0번 인덱스를 빼준다
        } else if (goal[i] == cards2[0]) {
            cards2.shift();
        } else { // 그러다 위의 두 경우에 해당하지 않게 되면 'No'를 반환한다
            return 'No'
        }
    }
    return 'Yes';
}