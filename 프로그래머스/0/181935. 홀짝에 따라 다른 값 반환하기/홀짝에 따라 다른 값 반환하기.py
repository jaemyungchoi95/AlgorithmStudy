def solution(n):
    answer = 0
    nArr = list(range(1,n+1))
    
    if n%2 == 0: # even
        for i in range(1, n, 2):
            answer += nArr[i]**2
        
    elif n%2 != 0: # odd
        for i in range(0, n, 2):
            answer += nArr[i]
            
    return answer