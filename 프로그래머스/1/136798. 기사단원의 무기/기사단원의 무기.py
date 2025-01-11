def solution(number, limit, power):
    answer = 0
    
    # number를 구성하는 숫자를 순회하면서
    for i in range(1, number + 1):
        tempCnt = 0 # 임시변수 선언
        # i의 제곱근의 +1 만큼의 범위를 탐색한다.
        for j in range(1, int(i**0.5) + 1):
            if i%j == 0: # 나머지가 0이면 약수로 판별하여 더해주는데
                tempCnt += 1
                if j != i // j: # 제곱수의 경우 하나만 들어가야 한다
                    tempCnt += 1
        
        # 공격력이 제한보다 큰 경우 정해진 공격력을 입력한다
        if tempCnt > limit:
            answer += power
        # 그렇지 않으면 공격력을 그대로 넣는다
        else:
            answer += tempCnt

    return answer