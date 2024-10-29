def solution(num_list):
    temp = 1
    if len(num_list) > 10:
        return sum(num_list)
    elif len(num_list) <= 10:
        for i in num_list:
            temp = (temp * i)
        return temp