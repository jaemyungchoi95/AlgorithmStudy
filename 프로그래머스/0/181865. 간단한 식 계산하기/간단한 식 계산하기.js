function solution(binomial) {
    let answer = 0;
    let ans = 0;
    
    if (binomial.includes(' + ')) {
        answer = binomial.split(' + ');
        ans = Number(answer[0]) + Number(answer[1]);
    }
    if (binomial.includes(' - ')) {
        answer = binomial.split(' - ');
        ans = answer[0] - answer[1];
    }
    if (binomial.includes(' * ')) {
        answer = binomial.split(' * ');
        ans = answer[0] * answer[1];
    }
    
    return ans;
}