def solution(num_list):
    x = 1
    
    for i in num_list:
        x = (x*i)
    
    return 1 if sum(num_list)**2 > x else 0