def solution(num_list):
    tempOdd = 0
    tempEven = 0
    
    for i in range(len(num_list)):
        if (i+1)%2 == 0:
            tempEven += num_list[i]
        else:
            tempOdd += num_list[i]
    
    return max(tempEven, tempOdd)