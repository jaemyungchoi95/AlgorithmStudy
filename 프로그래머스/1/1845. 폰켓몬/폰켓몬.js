function solution(nums) {
    var count = nums.length/2; // 가져갈 수 있는 마리수
    var reNums = new Set(nums).size; // 포켓몬 종류 중복제거
    
    // 3항 연산자를 이용하여 더 작은 수를 반환
    return count > reNums ? reNums : count
}