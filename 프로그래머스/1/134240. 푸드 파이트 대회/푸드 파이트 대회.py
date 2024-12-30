def solution(food):
    answer = ''
    tempArr = [] # 사용할 음식 수를 담아줄 임시배열 선언
    
    # food[1~3]의 몫을 tempArr에 담아준다
    for i in range(1, len(food)):
        tempArr.append(food[i]//2)
    
    # 대회에 사용될 음식만큼 반복하면서
    for i in range(len(tempArr)):
        if tempArr[i] > 0: # 만약 i가 0보다 큰 숫자일 경우
            for j in range(tempArr[i]): # tempArr에 할당된 갯수만큼
                # answer 에 음식을 더해준다 (0번 인덱스부터 1번 음식이라 i + 1)
                answer += str(i + 1) 
    
    # 정배열이 끝나면 0과 정배열의 완성된 문자열을 뒤집어 추가해준다.
    answer += "0" + answer[::-1]
    
    return answer