function solution(picture, k) {
    var answer = [];
    
    for (let i = 0; i < picture.length; i++) {
        let tmpStr = picture[i];
        let nextStr = '';
        for (let j = 0; j < picture[i].length; j++) {
            for (let l = 0; l < k; l++) {
                nextStr += tmpStr[j];
            }
        }
        for (let j = 0; j < k; j++) {
            answer.push(nextStr);
        }
    }
    
    return answer;
}