def solution(sizes):
    answer = 0
    arrS = [] # 작은 길이 배열
    arrB = [] # 큰 길이 배열
    
    for i in sizes:
        if i[0] > i[1]:
            i[0],i[1] = i[1],i[0]
        arrS.append(i[0])
        arrB.append(i[1])
    
    answer = max(arrS) * max(arrB)
    
    return answer