def solution(number, limit, power):
    answer = 0
    
    for i in range(1, number + 1):
        tempCnt = 0 # 임시변수 선언
        for j in range(1, int(i**0.5) + 1):
            if i%j == 0:
                tempCnt += 1
                if j != i // j:
                    tempCnt += 1

        if tempCnt > limit:
            answer += power
        else:
            answer += tempCnt

    return answer