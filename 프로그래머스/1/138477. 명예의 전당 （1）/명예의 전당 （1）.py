def solution(k, score):
    answer = []
    tempArr = [] # 임시배열
    
    # 점수를 순회하면서
    for i in score:
        # 만약 임시배열의 길이가 k 미만이면
        if len(tempArr) < k:
            tempArr.append(i) # tempArr에 값을 담아준다.
        elif len(tempArr) == k: # 임시배열의 길이가 k에 도달하면
            if min(tempArr) < i: # 그리고 현재까지 담겨진 임시배열의 최소값보다 i가 크면
                tempArr.sort() # 오름차순으로 정렬 후
                tempArr.pop(0) # 첫번째 최저값을 빼고
                tempArr.append(i) # 새로운 i값을 다시 담아준다.
        answer.append(min(tempArr))
    
    return answer