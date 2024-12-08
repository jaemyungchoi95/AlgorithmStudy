function solution(phone_number) {
    var answer = '';
    var leng = phone_number.length;
    
    for (i = 0; i < leng-4; i++) {
        answer += "*"
    }
    
    for (i = leng-4; i < leng; i++) {
        answer += phone_number[i];
    }
    
    return answer;
}