def solution(score):
    answer = []
    temp = []
    
    [temp.append(i[0] + i[1]) for i in score]
    
    tempArr = sorted(temp, reverse = True)
    
    [answer.append(tempArr.index(i)+1) for i in temp]
        
    return answer