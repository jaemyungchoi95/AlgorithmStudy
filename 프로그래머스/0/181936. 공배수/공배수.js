function solution(number, n, m) {
    if (number%n != 0 || number%m != 0) {
        return 0;
    } else {
        return 1;    
    }
}