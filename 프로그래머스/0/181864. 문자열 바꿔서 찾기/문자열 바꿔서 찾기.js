function solution(myString, pat) {
    let changed = '';

    // 1. 새로운 배열에 myString을 반전한 배열을 담아서 만들어준다.
    for (let i = 0; i < myString.length; i++) {
      if (myString[i] === 'A') changed += 'B';
      else changed += 'A';
    }
    
    // 2. 반전된 배열에 pat 포함여부에 따라 1 혹은 0 반환.
    return changed.includes(pat) ? 1 : 0;
}