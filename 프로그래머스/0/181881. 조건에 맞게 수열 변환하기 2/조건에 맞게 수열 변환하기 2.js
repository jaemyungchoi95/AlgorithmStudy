function solution(arr) {
    var answer = 0;
    var isTrue = true;
    
    while (isTrue) {
        const prev = [...arr];
        
        for (let i = 0; i < arr.length; i++) {
            if (arr[i] >= 50 && arr[i]%2 === 0) {
                arr[i] = arr[i]/2;
            }
            
            if (arr[i] < 50 && arr[i]%2 != 0) {
                arr[i] = arr[i]*2+1;
            }
        }
        
        if (JSON.stringify(prev) === JSON.stringify(arr)) {
            return answer;
        }        
        answer++;
    }
    
    return answer;
}