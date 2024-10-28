def solution(s):
    answer = []
    
    for x in s:
        if s.count(x) == 1:
            answer.append(x)
    
    return ''.join(sorted(answer))