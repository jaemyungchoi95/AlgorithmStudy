def solution(my_string, n):
    temp = []
    
    for i in my_string:
        temp.append(i*n)

    return ''.join(temp)