function solution(num_list) {
    var odd = '';
    var even = '';
    
    for (let i = 0; i < num_list.length; i++) {
        if (num_list[i]%2 == 0) {
            even += num_list[i].toString();
        }
        if (num_list[i]%2 != 0) {
            odd += num_list[i].toString();
        }
    }
    
    return Number(even) + Number(odd);
}