function solution(a, b) {
    // 2016년 a월 b일 날짜 생성 (월은 0월부터 계산하기 때문에 -1을 해준다)
    const date = new Date(2016, a - 1, b);
    
    // .getDay() 메서드는 요일을 일 ~ 토 순으로 0 ~ 6까지 반환해준다
    // 따라서 해당 순서대로 배열에 담아준다
    const days = ["SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"];
    return days[date.getDay()];
}