def solution(my_string, m, c):
    answer = []
    temp = list(_ for _ in my_string)
    
    if m >= c >= 1:
        answer.append(temp[c-1::m])
    
    return ''.join(sum(answer, []))