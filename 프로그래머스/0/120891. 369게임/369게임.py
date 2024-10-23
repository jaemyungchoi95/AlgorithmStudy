def solution(order):
    answer = 0
    temp = []
    
    [temp.append(x) for x in str(order)]
    
    for i in temp:
        if int(i)%10 == 3 or int(i)%10 == 6 or int(i)%10 == 9:
            answer += 1
    
    return answer