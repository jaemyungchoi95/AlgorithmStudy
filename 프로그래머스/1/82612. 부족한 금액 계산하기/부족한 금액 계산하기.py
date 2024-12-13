def solution(price, money, count):
    temp = 0
    
    for i in range(1, count+1):
        temp += price * i

    if money >= temp:
        return 0
    else:
        return temp - money