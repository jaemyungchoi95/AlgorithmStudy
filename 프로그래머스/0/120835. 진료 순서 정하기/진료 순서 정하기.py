def solution(emergency):
    answer = []
    sortedArr = list(reversed(sorted(emergency)))
    
    for i in range(len(emergency)):
        for j in range(len(sortedArr)):
            if emergency[i] == sortedArr[j]:
                answer.append(sortedArr.index(emergency[i])+1)
    
    return answer