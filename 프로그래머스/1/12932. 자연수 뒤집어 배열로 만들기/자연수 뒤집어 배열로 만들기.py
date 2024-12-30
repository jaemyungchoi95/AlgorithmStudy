def solution(n):
    answer = []
    temp = []
    
    for i in str(n):
        temp.append(i)
        
    temp.reverse()
    
    for i in temp:
        answer.append(int(i))
    
    return answer