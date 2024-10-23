def solution(my_string, num1, num2):
    temp = []
    
    for i in my_string:
        temp.append(i)
        
    temp[num1], temp[num2] = temp[num2], temp[num1]
    
    return ''.join(temp)