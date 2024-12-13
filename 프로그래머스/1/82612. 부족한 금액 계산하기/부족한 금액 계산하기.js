function solution(price, money, count) {
    var fee = 0;
    
    // count 만큼 반복하면서
    for (i = 1; i <= count; i++) {
        // price를 누적하여 더해준다
        fee += price * i;
    }
    
    // 만약 가진 돈이 충분하다면 0을 반환
    if (money >= fee) {
        return 0;
    // 그렇지 않다면 요금에서 가진돈을 뺀 값을 반환
    } else {
        return fee - money;
    }

}