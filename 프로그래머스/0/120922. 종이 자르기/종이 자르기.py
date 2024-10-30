def solution(M, N):
    answer = M-1
    
    for i in range(M):
        answer += N-1
    
    return answer