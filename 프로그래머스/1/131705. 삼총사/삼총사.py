def solution(number):
    answer = 0
    
    for i in range(len(number)): # 첫번째 숫자
        for j in range(i + 1, len(number)): # 두번째 숫자
            for k in range(j + 1, len(number)): # 세번째 숫자
                if number[i] + number[j] + number[k] == 0:
                    answer += 1
    
    return answer