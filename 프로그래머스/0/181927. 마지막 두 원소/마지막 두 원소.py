def solution(num_list):
    lastIdx = len(num_list)-1
    
    if num_list[lastIdx] > num_list[lastIdx-1]:
        num_list.append(num_list[lastIdx]-num_list[lastIdx-1])
    else:
        num_list.append(num_list[lastIdx]*2)
    
    return num_list