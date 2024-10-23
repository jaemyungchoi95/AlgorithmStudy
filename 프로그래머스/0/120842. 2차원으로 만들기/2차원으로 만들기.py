def solution(num_list, n):
    answer = []
    
    for i in range(len(num_list)//n):
        answer.append(num_list[0:n])
        for j in range(n):
            num_list.pop(0)
    
    return answer