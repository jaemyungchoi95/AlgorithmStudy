def solution(my_string):
    temp = []
    my_string = my_string.lower()
    
    for x in my_string:
        temp.append(x) 
    temp.sort()
    
    return ''.join(temp)