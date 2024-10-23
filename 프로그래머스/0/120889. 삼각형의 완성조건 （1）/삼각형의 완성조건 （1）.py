def solution(sides):
    answer = 0
    sides.sort()
    
    if max(sides) < sides[0]+sides[1]:
        answer = 1
    else:
        answer = 2
    
    return answer