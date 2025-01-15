def solution(nums):
    answer = 0
    leng = len(nums) # nums의 길이를 변수로 선언
    tempArr = [] # 경우의 수를 담아줄 임시배열 선언

    # nums의 배열 내에서 3개의 숫자를 뽑은 3중 for문 작성
    for i in range(leng):
        for j in range(i+1, leng):
            for k in range(j+1, leng):
                # 임시배열에 각 경우의 수를 담아준다
                tempArr.append(nums[i] + nums[j] + nums[k])
    
    # 경우의 수 배열을 탐색하면서
    for i in tempArr:
        tempNum = 0 # 각 탐색마다 임시변수를 선언 후
        # 소수를 판별하기 위해 2 ~ i만큼 탐색하면서
        for j in range(2, i+1):
            # 약수를 판별하여 갯수를 더해준다
            if i%j == 0:
                tempNum += 1
        # 만약 약수의 갯수가 1개이면 정답에 더해준다
        if tempNum == 1:
            answer += 1

    return answer