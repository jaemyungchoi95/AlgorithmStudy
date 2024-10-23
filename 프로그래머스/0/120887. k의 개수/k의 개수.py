def solution(i, j, k):
    temp = []
    
    for x in range(i, j+1):
        temp.append(str(x))
    
    return ''.join(temp).count(str(k))