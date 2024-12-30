function solution(s){
    var low = s.toLowerCase() // 문자열 s를 소문자로 변환
    
    let countP = low.split('p').length - 1;
    let countY = low.split('y').length - 1;
    
    if (countP === countY) {
        return true;
    } else {
        return false;
    }
}