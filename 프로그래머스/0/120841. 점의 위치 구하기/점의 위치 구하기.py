def solution(dot):
    answer = 0
    
    if dot[0] > 0: # x좌표값이 양수이면
        if dot[1] > 0: #y좌표값이 양수이면
            answer = 1
        else: # y좌표값이 음수이면
            answer = 4
    else: # x좌표값이 음수이면
        if dot[1] > 0: #y좌표값이 양수이면
            answer = 2
        else: # y좌표값이 음수이면
            answer = 3
    return answer