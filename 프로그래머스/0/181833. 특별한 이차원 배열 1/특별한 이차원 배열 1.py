def solution(n):
    answer = []
    temp = [0] * n
    
    for i in range(n):
        temp[i] += 1
        answer.append(temp)
        temp = [0] * n
    
    return answer