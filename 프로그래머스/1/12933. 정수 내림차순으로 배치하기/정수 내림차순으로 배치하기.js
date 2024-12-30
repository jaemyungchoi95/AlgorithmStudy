function solution(n) {
    return parseInt([...String(n)].sort().reverse().join(''));
}