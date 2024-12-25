def solution(t, p):
    answer = 0
    length = len(t)-len(p)+1 # 탐색해야 할 횟수
    
    for i in range(length):
        if int(t[i:i+len(p)]) <= int(p):
            answer += 1
    
    return answer