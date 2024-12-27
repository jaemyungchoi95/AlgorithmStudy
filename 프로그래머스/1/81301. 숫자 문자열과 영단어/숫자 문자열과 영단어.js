function solution(s) {
    const dic = ['zero', 'one', 'two', 'three', 'four', 'five', 'six', 'seven', 'eight', 'nine'];
    
    // dic 배열을 순회하면서 s 문자열에서 동일한 문자를 찾아 대체한다
    for (i = 0; i < dic.length; i++) {
        s = s.replaceAll(dic[i], String(i))
    }
    
    return parseInt(s);
}