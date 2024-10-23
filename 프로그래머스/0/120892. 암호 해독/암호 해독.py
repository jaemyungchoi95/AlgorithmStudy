def solution(cipher, code):
    answer = []
    temp = []
    
    [temp.append(x) for x in cipher]
    
    [answer.append(temp[i]) for i in range(code-1, len(cipher), code)]
        
    return ''.join(answer)