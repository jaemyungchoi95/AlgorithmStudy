def solution(before, after):
    temp = []
    temp2 = []
    [temp.append(i) for i in before]
    temp.sort()
    [temp2.append(i) for i in after]
    temp2.sort()
    
    if temp == temp2:
        answer = 1
    else:
        answer = 0
    
    
    return answer