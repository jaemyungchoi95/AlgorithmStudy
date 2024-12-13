process.stdin.setEncoding('utf8');
process.stdin.on('data', data => {
    const n = data.split(" ");
    const a = Number(n[0]), b = Number(n[1]);
    
    // 별의 갯수를 담아줄 변수 선언
    var star = '';
    
    // 이중 for 문을 통해 star를 n만큼 담아주었을때 한번 출력 후 초기화
    for (i = 0; i < b; i++) {
        for (j = 0; j < a; j++) {
            star += '*';
        }
        console.log(star)
        // 출력한 후에는 star를 다시 빈 문자열로 초기화
        star = '';
    }
    
});

