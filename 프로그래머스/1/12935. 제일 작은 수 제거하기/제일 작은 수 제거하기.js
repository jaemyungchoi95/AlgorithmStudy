function solution(arr) {
    var answer = [];
    const idx = arr.indexOf(Math.min(...arr));

    if (arr.length <= 1) {
        answer.push(-1);
        return answer;
    } else {
        arr.splice(idx, 1);
        return arr;
    }

}