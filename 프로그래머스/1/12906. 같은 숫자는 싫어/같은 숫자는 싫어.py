def solution(arr):
    answer = [arr[0]]
    now = arr[0]
    
    print(answer)
    print(now)
    
    for i in arr:
        if i != now:
            answer.append(i)
            now = i
            
    return answer