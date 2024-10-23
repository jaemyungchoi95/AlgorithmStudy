def solution(price):
    answer = price
    
    if 300000 > price >= 100000:
        answer = int(price * 0.95)
    elif 500000 > price >= 300000:
        answer = int(price * 0.9)
    elif price >= 500000:
        answer = int(price * 0.8)
    
    return answer