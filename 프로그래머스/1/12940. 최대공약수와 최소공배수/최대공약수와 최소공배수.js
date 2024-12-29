function solution(n, m) {
    // 최대공약수를 구하는 함수
    function gcd(a ,b) {
        while (b != 0) { // b가 0이 될때까지
            let temp = b; // b는 임시변수에 저장해놓고
            b = a%b; // b의 값을 a와 b를 나눈 나머지로 저장
            a = temp; // a에 원래 b의 값을 임시변수로부터 가져와서 저장
        }
        return a // 나머지가 없이 나누어떨어진 a를 최대공약수로 반환
    }
    
    // 최대공약수
    var gcd_value = gcd(n, m);
    // 최소공배수
    var lcm_value = (n * m)/gcd_value

    
    return [gcd_value, lcm_value];
}