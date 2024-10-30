def solution(my_string):
    answer = []
    length = len(my_string)
    
    for i in range(length-1, -1, -1):
        answer.append(my_string[i:length])
    answer.sort()
    
    return answer