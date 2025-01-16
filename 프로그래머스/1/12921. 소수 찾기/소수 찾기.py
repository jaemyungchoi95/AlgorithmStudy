def solution(n):
    # 에라토스테네스의 체를 활용
    
    # 0 ~ n까지의 모든 수를 우선 소수로 가정하여 True로 채운 배열을 선언한다
    tempArr = [True] * (n + 1)
    # 0과 1은 소수가 아니기 때문에 False를 대입해준다
    tempArr[0], tempArr[1] = False, False
    
    for i in range(2, int(n**0.5) + 1):
        # 만약 i가 소수라면
        if tempArr[i]:
            # i의 배수들은 소수가 아니므로 False로 바꿔준다.
            for j in range(i * i, n + 1, i):
                tempArr[j] = False

    return sum(tempArr)