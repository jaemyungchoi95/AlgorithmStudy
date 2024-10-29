def solution(my_string):
    answer = []
    my_string = my_string.split(' ')
    
    for x in my_string:
        if x != '':
            answer.append(x)
    
    return answer