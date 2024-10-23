def solution(n):
    answer = [] # 순서쌍을 담아줄 배열
    
    for i in range(1, n+1):
        if n%i == 0:
            answer.append(i)
    
    return len(answer)