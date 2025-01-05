function solution(strings, n) {
    return strings.sort((a, b) => {
        if (a[n] === b[n]) {
            return a.localeCompare(b); // n번째 문자가 같으면 사전순 정렬
        }
        return a[n].localeCompare(b[n]); // n번째 문자를 기준으로 정렬
    });
}

// localeCompare : 문자열을 유니코드 순서대로 비교해주는 함수!
// string1.localeCompare(string2); 형태로 사용하며 아래와 같은 결과를 반환
// 음수 (-1): string1이 string2보다 앞에 있다.
// 0: 두 문자열이 같다.
// 양수 (1): string1이 string2보다 뒤에 있다.